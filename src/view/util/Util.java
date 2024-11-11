package view.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Util {
    
    public static byte[] lerArquivoPDF(File file) {
        FileInputStream fis;
        try {
            fis = new FileInputStream(file);
            byte[] buffer = new byte[(int) file.length()];
            fis.read(buffer);
            fis.close();
            return buffer;
        } catch (IOException e) {
           
        }
        return null;
    }
}
