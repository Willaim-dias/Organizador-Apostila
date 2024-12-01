package view;

import java.awt.Image;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import model.Service.DocumentService;
import model.entities.Document;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import view.util.PdfUtil;

public class ScreenMainControl {

    private final DocumentService service = new DocumentService();
    private final PdfUtil pdfUtil = new PdfUtil();

    private final ScreenMain main;
    private PDFRenderer renderer;
    
    private int pageNumber = 0;
    private int heavyPages = 0;
    
    int width;

    private final List<Object> list = new ArrayList<>();

    public ScreenMainControl(ScreenMain main) {
        this.main = main;
        width = main.getLabelShowFile().getWidth();
    }

    //adiciona dados a tabela
    public void addDataDable() {
        DefaultTableModel dtm = (DefaultTableModel) main.getTableData().getModel();
        list.clear();
        dtm.setRowCount(0);
        List<Document> result = service.findAll();
        if (result != null) {
            main.getLabelTotal().setText("Total de arquivos: " + result.size());
            for (Document doc : result) {
                Object[] obj = {doc.getId(), doc.getName().toLowerCase()};
                dtm.addRow(obj);
            }
        }
    }

    //realiza buscas na tabela
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
            if (obj instanceof Object[] array) {
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
        }
        if (img != null) {
            Image formatedImg = img.getScaledInstance((width - 20), 1200, Image.SCALE_SMOOTH);
            main.getLabelShowFile().setIcon(new ImageIcon(formatedImg));
        }
    }

    public void openPdf(String id) {
        heavyPages = 0;
        Document doc = service.findById(Integer.parseInt(id));
        renderer = pdfUtil.rendererPDF(doc.getPdf());
        pageNumber = pdfUtil.getNumberPage();
        main.getLabelShowNumber().setText("1/" + pageNumber);
        showPdf(0);
    }

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
        Document doc = service.findById(id);
        try {
            try (FileOutputStream fos = new FileOutputStream(file)) {
                fos.write(doc.getPdf());
            }
        } catch (IOException e) {
        }
    }

    public void deletePDF(int id) {
        service.remove(id);
        addDataDable();
    }
}
