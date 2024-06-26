/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package features;
import control.ControlCustomer;
import event.TableEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCustomer;
import model.ModelHeaderTable;
import model.ModelRenderTable;
import swing.TableCellEditor;
import swing.TableCellEventRender;

/**
 *
 * @author usER
 */
public class Customer extends javax.swing.JPanel {

    /**
     * Creates new form Transaksi
     */
    private TableEvent event;
    private DefaultTableModel tabmodel1;
    private TableRowSorter<DefaultTableModel> tableRowSorter1;
    private ControlCustomer controlCustomer = new ControlCustomer();
    public Customer() {
        initComponents();
        textAlamat.setLineWrap(true);
        textAlamat.setWrapStyleWord(true);
        txtIdCustomer.setText(controlCustomer.autoID());
        styleTable(scrollTableData, tableData, 4);
        tabmodel1 = (DefaultTableModel) tableData.getModel();
        tableRowSorter1 = new TableRowSorter<>(tabmodel1);
        tableData.setRowSorter(tableRowSorter1);
        enableField();
        tampilDataTable();
        eventTable();
        cariDataTable();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbSubHeader = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtIdCustomer = new javax.swing.JTextField();
        txtNamaCustomer = new javax.swing.JTextField();
        txtNoTelp = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        scrollAlamat = new javax.swing.JScrollPane();
        textAlamat = new javax.swing.JTextArea();
        panelTable = new javax.swing.JPanel();
        scrollTableData = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        panelData.setBackground(new java.awt.Color(185, 185, 185));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(149, 2, 179));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER");
        jLabel1.setOpaque(true);

        panelForm.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("ID Customer");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nama Customer");

        lbSubHeader.setBackground(new java.awt.Color(149, 2, 179));
        lbSubHeader.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbSubHeader.setForeground(new java.awt.Color(255, 255, 255));
        lbSubHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubHeader.setText("Tambah Customer");
        lbSubHeader.setOpaque(true);

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Alamat");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("No Telpon");

        txtIdCustomer.setBackground(new java.awt.Color(255, 255, 255));
        txtIdCustomer.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtIdCustomer.setForeground(new java.awt.Color(0, 0, 0));
        txtIdCustomer.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIdCustomer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(185, 185, 185)));

        txtNamaCustomer.setBackground(new java.awt.Color(255, 255, 255));
        txtNamaCustomer.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtNamaCustomer.setForeground(new java.awt.Color(0, 0, 0));
        txtNamaCustomer.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNamaCustomer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(185, 185, 185)));

        txtNoTelp.setBackground(new java.awt.Color(255, 255, 255));
        txtNoTelp.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtNoTelp.setForeground(new java.awt.Color(0, 0, 0));
        txtNoTelp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNoTelp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(185, 185, 185)));
        txtNoTelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoTelpKeyTyped(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(149, 2, 179));
        btnTambah.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("TAMBAH");
        btnTambah.setBorderPainted(false);
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(0, 0, 153));
        btnBatal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("BATAL");
        btnBatal.setBorderPainted(false);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        scrollAlamat.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textAlamat.setColumns(20);
        textAlamat.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        textAlamat.setRows(5);
        scrollAlamat.setViewportView(textAlamat);

        javax.swing.GroupLayout panelFormLayout = new javax.swing.GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSubHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaCustomer, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNoTelp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdCustomer)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelFormLayout.setVerticalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSubHeader)
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnBatal))
                .addContainerGap())
        );

        panelTable.setBackground(new java.awt.Color(255, 255, 255));

        tableData.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Customer", "Nama Customer", "No Telpon", "Alamat", "Opsi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableData.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableData.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        scrollTableData.setViewportView(tableData);
        if (tableData.getColumnModel().getColumnCount() > 0) {
            tableData.getColumnModel().getColumn(0).setMinWidth(200);
            tableData.getColumnModel().getColumn(0).setPreferredWidth(200);
            tableData.getColumnModel().getColumn(0).setMaxWidth(200);
            tableData.getColumnModel().getColumn(4).setMinWidth(200);
            tableData.getColumnModel().getColumn(4).setPreferredWidth(200);
            tableData.getColumnModel().getColumn(4).setMaxWidth(200);
        }

        txtCari.setBackground(new java.awt.Color(255, 255, 255));
        txtCari.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCari.setForeground(new java.awt.Color(185, 185, 185));
        txtCari.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCari.setText("Cari ID Layanan atau Nama Layanan");
        txtCari.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(185, 185, 185)));
        txtCari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCariFocusGained(evt);
            }
        });

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTableData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCari)
                .addContainerGap())
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTableData, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDataLayout = new javax.swing.GroupLayout(panelData);
        panelData.setLayout(panelDataLayout);
        panelDataLayout.setHorizontalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addComponent(panelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelDataLayout.setVerticalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        add(panelData, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if(btnTambah.getText().equals("TAMBAH")) {
            if(validasiTambahData()) {
                tambahData();
                clearFieldAll();
                tabmodel1.setRowCount(0);
                tampilDataTable();
            }    
        } else {
            ubahData();
            lbSubHeader.setText("Tambah Layanan");
            clearFieldAll();
            tabmodel1.setRowCount(0);
            tampilDataTable();
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCariFocusGained
        txtCari.setText("");
        txtCari.setForeground(new Color(0, 0, 0));
        txtCari.setFont(new Font("sansserif", 0, 14));
    }//GEN-LAST:event_txtCariFocusGained

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        btnTambah.setText("TAMBAH");
        lbSubHeader.setText("Tambah Layanan");
        clearFieldAll();
        txtIdCustomer.setText(controlCustomer.autoID());
        tabmodel1.setRowCount(0);
        tampilDataTable();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        int row = tableData.getSelectedRow();
        piliLayanan(row);
        btnTambah.setText("UBAH");
        lbSubHeader.setText("Ubah Layanan");
    }//GEN-LAST:event_tableDataMouseClicked

    private void txtNoTelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoTelpKeyTyped
        char typed = evt.getKeyChar();
        if(!Character.isDigit(typed)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNoTelpKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel lbSubHeader;
    private javax.swing.JPanel panelData;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelTable;
    private javax.swing.JScrollPane scrollAlamat;
    private javax.swing.JScrollPane scrollTableData;
    private javax.swing.JTable tableData;
    private javax.swing.JTextArea textAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdCustomer;
    private javax.swing.JTextField txtNamaCustomer;
    private javax.swing.JTextField txtNoTelp;
    // End of variables declaration//GEN-END:variables

    
//    Tampil Data Table
    private void tampilDataTable() {
        for(ModelCustomer modelCustomer : controlCustomer.getData()) {
            tabmodel1.addRow(new String[]{
                modelCustomer.getIdCustomer(),
                modelCustomer.getNamaCustomer(),
                modelCustomer.getNoTelp(),
                modelCustomer.getAlamat()
            });
        }
    }
    
//    Tambah Layanan
    private void tambahData() {
        String idCustomer = txtIdCustomer.getText();
        String namaCustomer = txtNamaCustomer.getText();
        String noTelp = txtNoTelp.getText();
        String alamat = textAlamat.getText();
        ModelCustomer modelCustomer = new ModelCustomer(idCustomer, namaCustomer, noTelp, alamat);
        controlCustomer.addData(modelCustomer);
        txtIdCustomer.setText(controlCustomer.autoID());
    }
    
//    Ubah Layanan
    private void ubahData() {
        String idCustomer = txtIdCustomer.getText();
        String namaCustomer = txtNamaCustomer.getText();
        String noTelp = txtNoTelp.getText();
        String alamat = textAlamat.getText();
        ModelCustomer modelCustomer = new ModelCustomer(idCustomer, namaCustomer, noTelp, alamat);
        controlCustomer.updateData(modelCustomer);
        txtIdCustomer.setText(controlCustomer.autoID());
    }
    
    private void hapusData(int row) {
        String idCustomer = (String) tableData.getValueAt(row, 0);
        ModelCustomer modelCustomer = new ModelCustomer();
        modelCustomer.setIdCustomer(idCustomer);
        if(controlCustomer.validationDelete(modelCustomer)) {
            int confirm = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus customer ini?", "Konfirmasi", JOptionPane.YES_OPTION);
            if(confirm == 0) {
                if(tableData.isEditing()) {
                    tableData.getCellEditor().stopCellEditing();
                }
                controlCustomer.deleteData(modelCustomer);
                tabmodel1.removeRow(row);
                txtIdCustomer.setText(controlCustomer.autoID());
                clearFieldAll();
                btnTambah.setText("TAMBAH");
            }
        }
    }
    
//    Cari Data Layanan
    private void cariDataTable() {
        txtCari.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = txtCari.getText();
                if(text.length() == 0) {
                    tableRowSorter1.setRowFilter(null);
                } else {
                    tableRowSorter1.setRowFilter(RowFilter.regexFilter("(?i)" + text, 0, 1));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = txtCari.getText();
                if(text.length() == 0) {
                    tableRowSorter1.setRowFilter(null);
                } else {
                    tableRowSorter1.setRowFilter(RowFilter.regexFilter("(?i)" + text, 0, 1));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
    }
    
//    Pilih Layanan
    private void piliLayanan(int row) {
        String idCustomer = (String) tableData.getValueAt(row, 0);
        String namaCustomer = (String) tableData.getValueAt(row, 1);
        String noTelp = (String) tableData.getValueAt(row, 2);
        String alamat = (String) tableData.getValueAt(row, 3);
        txtIdCustomer.setText(idCustomer);
        txtNamaCustomer.setText(namaCustomer);
        txtNoTelp.setText(noTelp);
        textAlamat.setText(alamat);
    }
    
    //  Style Table
    private void styleTable(JScrollPane scroll, JTable table, int columnTable) {
        scroll.getViewport().setBackground(new Color(255,255,255));
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255,255,255));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
        scroll.setBorder(new EmptyBorder(5,10,5,10));
        table.setRowHeight(35);        
        table.getTableHeader().setDefaultRenderer(new ModelHeaderTable());
        table.setDefaultRenderer(Object.class, new ModelRenderTable(columnTable));
    }
    
//    event table
    private void eventTable() {
        event = new TableEvent() {
            @Override
            public void onEdit(int row) {
                
            }

            @Override
            public void onDelete(int row) {
                hapusData(row);
            }

            @Override
            public void onView(int row) {
                
            }
        };
        
        tableData.getColumnModel().getColumn(4).setCellRenderer(new TableCellEventRender(false, true, false));
        tableData.getColumnModel().getColumn(4).setCellEditor(new TableCellEditor(event, false, true, false));
    }
    
    private void clearFieldAll() {
        txtNamaCustomer.setText("");
        txtNoTelp.setText("");
        textAlamat.setText("");
    }
    
    private void enableField() {
        txtIdCustomer.setEnabled(false);
    }
    
    private boolean validasiTambahData() {
        boolean valid = false;
        if(txtNamaCustomer.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Mohon isi nama customer");
        } else if(txtNoTelp.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Mohon isi no telpon customer");
        } else if(textAlamat.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Mohon isi alamat customer");
        } else {
            valid = true;
        }
        return valid;
    }
        
}
