package view;

import javax.swing.JOptionPane;

public class ShowMessage {
 
    public ShowMessage(){
    }
    
    public void information(String message) {
        JOptionPane.showMessageDialog(null, message, "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void aler(String message) {
        JOptionPane.showMessageDialog(null, message, "Allerta", JOptionPane.WARNING_MESSAGE);
    }
    
}
