package controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

public class PDFModules {

    private PDDocument document = null;
    private PDFRenderer renderer;
    private int numberPage;

    public PDFModules() {
    }

    public PDFRenderer dbRendererPDF(byte[] pdfByte) {
        try {
            document = PDDocument.load(new ByteArrayInputStream(pdfByte));
            numberPage = document.getNumberOfPages();
            renderer = new PDFRenderer(document);
            return renderer;
        } catch (IOException e) {
            System.out.println("Erro ao renderizar página: " + e);
        }
        return null;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void closeDocument() {
        if (document != null) {
            try {
                document.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar o documento: " + e);
            }
        }
    }
}
