package controller;

import java.awt.Image;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import model.DeleteData;
import model.GetData;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import view.ScreenMain;

public class MainControl {

    private final ScreenMain main;
    private final PDFModules pdfModules;
    private PDFRenderer renderer;
    private int pageNumber;
    int width;
    private final List<Object> list = new ArrayList<>();

    public MainControl(ScreenMain main) {
        this.main = main;
        pdfModules = new PDFModules();
        width = main.getLabelShowFile().getWidth();
    }

    public void addDataDable() {
        DefaultTableModel dtm = (DefaultTableModel) main.getTableData().getModel();
        list.clear();
        dtm.setRowCount(0);

        GetData getData = new GetData();
        List<Map<String, Object>> result = getData.recuperarDatas();
        for (Map<String, Object> row : result) {
            Object[] obj = {row.get("id"), row.get("nome_arquivo")};
            dtm.addRow(obj);
        }
    }

    public void searchTable(String search) {
        DefaultTableModel dtm = (DefaultTableModel) main.getTableData().getModel();
        int contRows = main.getTableData().getRowCount();
        list.clear();
        for (int i = 0; i < contRows; i++) {
            Object[] obj = {main.getTableData().getValueAt(i, 0), main.getTableData().getValueAt(i, 1)};
            list.add(obj);
        }
        dtm.setRowCount(0);
        for (Object obj : list) {
            if (obj instanceof Object[]) {
                Object[] array = (Object[]) obj;
                if (array[0].toString().equals(search) || array[1].toString().equals(search)) {
                    dtm.addRow(array);
                }
            }
        }
    }

    public void showPdf(int page) {
        Image img = null;
        try {
            img = renderer.renderImageWithDPI(page, 150, ImageType.RGB);
        } catch (IOException ex) {
            System.out.println("Erro: " + ex);
        }
        if (img != null) {
            Image formatedImg = img.getScaledInstance((width - 20), 1200, Image.SCALE_SMOOTH);
            main.getLabelShowFile().setIcon(new ImageIcon(formatedImg));
        }
    }

    public void openPdf(String id) {
        if (renderer != null) {
            pdfModules.closeDocument();
        }
        GetData getData = new GetData();
        renderer = pdfModules.dbRendererPDF(getData.recuperarPDF(Integer.parseInt(id)));
        pageNumber = pdfModules.getNumberPage();
        main.getLabelShowNumber().setText("1/" + pageNumber);
        showPdf(0);
    }

    private int heavyPages = 0;

    public void skipPage(int btn) {
        if (pageNumber > 0) {
            if (btn == 1) {
                if (heavyPages != (pageNumber - 1)) {
                    heavyPages += 1;
                    showPdf(heavyPages);
                    main.getLabelShowNumber().setText((heavyPages + 1) + "/" + pageNumber);
                }
            } else {
                if (heavyPages != 0) {
                    heavyPages -= 1;
                    showPdf(heavyPages);
                    main.getLabelShowNumber().setText((heavyPages + 1) + "/" + pageNumber);
                }
            }
        }

    }

    public void getPDF(int id, String file) {
        GetData getData = new GetData();
        try {
            try (FileOutputStream fos = new FileOutputStream(file)) {
                fos.write(getData.recuperarPDF(id));
            }
        } catch (IOException e) {
        }
    }

    public void deletePDF(int id) {
        DeleteData delete = new DeleteData();
        delete.removePDF(id);
        addDataDable();
    }
}
