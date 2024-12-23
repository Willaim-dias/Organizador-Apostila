package view;

import view.util.Alert;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ScreenMain extends javax.swing.JFrame {

    private final ScreenMainControl control;
    private final Alert message = new Alert();

    public ScreenMain() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/image/pdf-book.png")).getImage());
        control = new ScreenMainControl(this);
        control.addDataDable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnOpenPDF = new javax.swing.JButton();
        btnBefore = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnDescription = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDownload = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        scrollPaneTable = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        labelTotal = new javax.swing.JLabel();
        labelShowNumber = new javax.swing.JLabel();
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
                btnOpenPDFActionPerformed();
            }
        });

        btnBefore.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnBefore.setText("<<<<<");
        btnBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeforeActionPerformed();
            }
        });

        btnNext.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnNext.setText(">>>>>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed();
            }
        });

        btnDescription.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDescription.setText("Descrição");
        btnDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescriptionActionPerformed();
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDelete.setText("Excluir Arquivo");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed();
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAdd.setText("Adicionar Arquivo");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed();
            }
        });

        btnDownload.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDownload.setText("Baixar");
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed();
            }
        });

        btnUpdate.setText("Atualizar Tabela");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed();
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
                btnSearchActionPerformed();
            }
        });

        labelTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(255, 255, 255));
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        labelShowNumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelShowNumber.setForeground(new java.awt.Color(255, 255, 255));
        labelShowNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelShowNumber.setText("0/0");

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
                    .addComponent(btnDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnDownload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOpenPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelShowNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
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

    private void btnOpenPDFActionPerformed() {//GEN-FIRST:event_btnOpenPDFActionPerformed
        if (tableData.getSelectedRow() < 0) {
            Alert.menssage("Selecione uma linha", "into", JOptionPane.INFORMATION_MESSAGE);
        } else {
            control.openPdf(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_btnOpenPDFActionPerformed

    private void btnBeforeActionPerformed() {//GEN-FIRST:event_btnBeforeActionPerformed
        control.skipPage(2);
    }//GEN-LAST:event_btnBeforeActionPerformed

    private void btnNextActionPerformed() {//GEN-FIRST:event_btnNextActionPerformed
        control.skipPage(1);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDescriptionActionPerformed() {//GEN-FIRST:event_btnDescriptionActionPerformed
        if (tableData.getSelectedRow() < 0) {
            Alert.menssage("Selecione uma linha", "into", JOptionPane.INFORMATION_MESSAGE);
        } else {
            ScreenDescription show = new ScreenDescription();
            int id = Integer.parseInt(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
            show.AddData(id);
            show.setLocation(this.getX(), this.getY());
            show.setVisible(true);
        }
    }//GEN-LAST:event_btnDescriptionActionPerformed

    private void btnDeleteActionPerformed() {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tableData.getSelectedRow() < 0) {
            Alert.menssage("Selecione uma linha", "into", JOptionPane.INFORMATION_MESSAGE);
        } else {  
            if (Alert.confirmation("Tem certeza que deseja excluir os dados?")) {
                int id = Integer.parseInt(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
                control.deletePDF(id);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed() {//GEN-FIRST:event_btnAddActionPerformed
        ScreenAddPdf sdp = new ScreenAddPdf();
        sdp.setLocation(this.getX(), this.getY());
        sdp.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed() {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtSearch.getText().equals("")) {
            Alert.menssage("Preencha o campo de Pesquisa", "into", JOptionPane.INFORMATION_MESSAGE);
        } else {
            control.searchTable(txtSearch.getText());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDownloadActionPerformed() {//GEN-FIRST:event_btnDownloadActionPerformed
        if (tableData.getSelectedRow() < 0) {
            Alert.menssage("Selecione uma linha", "into", JOptionPane.INFORMATION_MESSAGE);
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

    private void btnUpdateActionPerformed() {//GEN-FIRST:event_btnUpdateActionPerformed
        control.addDataDable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    public JLabel getLabelShowFile() {
        return labalShowFile;
    }

    public JLabel getLabelShowNumber() {
        return labelShowNumber;
    }

    public JLabel getLabelTotal() {
        return labelTotal;
    }

    public JTable getTableData() {
        return tableData;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBefore;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDescription;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpenPDF;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel labalShowFile;
    private javax.swing.JLabel labelBottom;
    private javax.swing.JLabel labelShowNumber;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JPanel panel;
    private view.components.scrollPane scrollPane;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
