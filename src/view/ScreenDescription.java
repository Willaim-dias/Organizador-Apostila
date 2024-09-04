package view;

import model.GetData;

public class ScreenDescription extends javax.swing.JFrame {

    public ScreenDescription() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/image/pdf-book.png")).getImage());
    }

    public void AddData(int id){
        GetData getData = new GetData();
        String[] data = getData.getDetails(id);
        txtName.setText(data[0]);
        txtReference.setText(data[1]);
        txtArea.setText(data[2]);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        labelTitle2 = new javax.swing.JLabel();
        txtReference = new javax.swing.JTextField();
        labelTitle1 = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Descrição");

        labelTitle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Nome do Arquivo");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        labelTitle2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle2.setText("Referencia");

        txtReference.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        labelTitle1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle1.setText("Descrição");

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtArea.setRows(5);
        scrollPane.setViewportView(txtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName)
                    .addComponent(txtReference)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(labelTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtReference, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTitle1;
    private javax.swing.JLabel labelTitle2;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtReference;
    // End of variables declaration//GEN-END:variables
}
