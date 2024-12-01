package view.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

public class PdfUtil {

    private PDDocument document = null;
    private PDFRenderer renderer;
    private int numberPage;

    public PdfUtil() {
    }

    public static boolean isValidExtension(File file, String expectedExtension) {
        String fileName = file.getName();
        int lastDot = fileName.lastIndexOf(".");
        if (lastDot == -1) {
            return false;
        }
        String fileExtension = fileName.substring(lastDot + 1);
        return fileExtension.equalsIgnoreCase(expectedExtension);
    }
    
    public static byte[] convertToByte(File file) {
        if (file == null || !file.exists() || !file.isFile()) {
            throw new IllegalArgumentException("Arquivo inválido ou não encontrado.");
        }

        try (FileInputStream fis = new FileInputStream(file)) {
            // Usa o tamanho do arquivo para criar o buffer
            byte[] buffer = fis.readAllBytes();
            return buffer;
        } catch (IOException e) {
            System.err.println("Erro ao converter o arquivo para bytes: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    public PDFRenderer rendererPDF(byte[] pdfByte) {
        try {
            if (document != null) {
                document.close();
            }
            document = PDDocument.load(new ByteArrayInputStream(pdfByte));
            numberPage = document.getNumberOfPages();
            renderer = new PDFRenderer(document);
            return renderer;
        } catch (IOException e) {
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
            }
        }
    }

}
