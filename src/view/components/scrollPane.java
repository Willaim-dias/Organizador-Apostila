package view.components;

import javax.swing.*;

public class scrollPane extends JScrollPane {
    
    public scrollPane() {
        super();
        setOpaque(false);
        getViewport().setOpaque(false);
        setBorder(null);
    }
}

