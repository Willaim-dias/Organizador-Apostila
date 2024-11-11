package view.util;

import javax.swing.JOptionPane;

public class Alert {
 
    public Alert(){
    }
    
    public static void menssage(String message,String title, int type) {
        JOptionPane.showMessageDialog(null, message, title, type);
    }
    
    public static boolean confirmation(String message) {
       int resp = JOptionPane.showConfirmDialog(null,message, "Confirmação", JOptionPane.YES_NO_OPTION); 
       return (resp == 0);
    }
}
