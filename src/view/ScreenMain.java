package view;

import controller.MainControl;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ScreenMain extends javax.swing.JFrame {

    private final MainControl control;
    private final ShowMessage message = new ShowMessage();

    public ScreenMain() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/image/pdf-book.png")).getImage());
        control = new MainControl(this);
        control.addDataDable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnOpenPDF = new javax.swing.JButton();
        btnBefore = new javax.swing.JButton();
        labelShowNumber = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnShowDetails = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDownload = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        scrollPaneTable = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        scrollPane = new view.components.scrollPane();
        labalShowFile = new javax.swing.JLabel();
        labelBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        panel.setOpaque(false);

        btnOpenPDF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnOpenPDF.setText("Abrir Arquivo");
        btnOpenPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenPDFActionPerformed(evt);
            }
        });

        btnBefore.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnBefore.setText("<<<<<");
        btnBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeforeActionPerformed(evt);
            }
        });

        labelShowNumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelShowNumber.setForeground(new java.awt.Color(255, 255, 255));
        labelShowNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelShowNumber.setText("0/0");

        btnNext.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnNext.setText(">>>>>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnShowDetails.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnShowDetails.setText("Ver Detalhes");
        btnShowDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDetailsActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDelete.setText("Excluir Arquivo");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAdd.setText("Adicionar Arquivo");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDownload.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDownload.setText("Baixar");
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        btnUpdate.setText("Atualizar Tabela");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titulo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneTable.setViewportView(tableData);
        if (tableData.getColumnModel().getColumnCount() > 0) {
            tableData.getColumnModel().getColumn(0).setPreferredWidth(5);
            tableData.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSearch.setText("Pesquisar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpenPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnBefore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelShowNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext))
                    .addComponent(btnShowDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnDownload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOpenPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelShowNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShowDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 313, 630));

        scrollPane.setViewportView(labalShowFile);

        getContentPane().add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 960, 630));

        labelBottom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundImg.jpg"))); // NOI18N
        getContentPane().add(labelBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenPDFActionPerformed
        if (tableData.getSelectedRow() < 0) {
            message.information("Selecione uma linha");
        } else {
            control.openPdf(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_btnOpenPDFActionPerformed

    private void btnBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeforeActionPerformed
        control.skipPage(2);
    }//GEN-LAST:event_btnBeforeActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        control.skipPage(1);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnShowDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDetailsActionPerformed
        if (tableData.getSelectedRow() < 0) {
            message.information("Selecione uma linha");
        } else {
            ScreenShowDetails show = new ScreenShowDetails();
            int id = Integer.parseInt(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
            show.AddData(id);
            show.setVisible(true);
        }
    }//GEN-LAST:event_btnShowDetailsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tableData.getSelectedRow() < 0) {
            message.information("Selecione uma linha");
        } else {
            int resp = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir os dados?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                int id = Integer.parseInt(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
                control.deletePDF(id);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        ScreenAddPdf sdp = new ScreenAddPdf();
        sdp.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtSearch.getText().equals("")) {
            message.information("Preencha o campo de Pesquisa");
        } else {
            control.searchTable(txtSearch.getText());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        if (tableData.getSelectedRow() < 0) {
            message.information("Selecione uma linha");
        } else {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Salvar PDF");

            fileChooser.setSelectedFile(new File(tableData.getValueAt(tableData.getSelectedRow(), 1).toString() + ".pdf"));

            int conf = fileChooser.showSaveDialog(this);

            if (conf == 0) {
                File file = fileChooser.getSelectedFile();
                int number = Integer.parseInt(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
                control.getPDF(number, file.toString());
            }
        }
    }//GEN-LAST:event_btnDownloadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        control.addDataDable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ScreenMain().setVisible(true);
        });
    }

    public JLabel getLabelShowFile() {
        return labalShowFile;
    }

    public JLabel getLabelShowNumber() {
        return labelShowNumber;
    }

    public JTable getTableData() {
        return tableData;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBefore;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpenPDF;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowDetails;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel labalShowFile;
    private javax.swing.JLabel labelBottom;
    private javax.swing.JLabel labelShowNumber;
    private javax.swing.JPanel panel;
    private view.components.scrollPane scrollPane;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
