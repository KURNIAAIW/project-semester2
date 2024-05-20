/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package features;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import control.ControlVoucher;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.ModelHeaderTable;
import model.ModelRenderTable;
import model.ModelVoucher;
import net.sf.jasperreports.engine.JRException;
import report.FieldVoucher;
import report.ParamVoucher;
import report.ReportManager;


/**
 *
 * @author usER
 */
public class Voucher extends javax.swing.JPanel {

    /**
     * Creates new form Transaksi
     */
    private DefaultTableModel tabmodel;
    private TableRowSorter<DefaultTableModel> rowSorter;
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private ControlVoucher controlVoucher = new ControlVoucher();
    public Voucher() {
        initComponents();
        instance();
        txtKdVoucher.setText(controlVoucher.autoID());
        txtTglPembuatan.setText(sdf.format(new Date()));
        styleTable(scrollTableData, tableData, 5);
        tabmodel = (DefaultTableModel) tableData.getModel();
        rowSorter = new TableRowSorter<>(tabmodel);
        tableData.setRowSorter(rowSorter);
        tampilData();
        enableField();
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
        txtKdVoucher = new javax.swing.JTextField();
        txtBesarVoucher = new javax.swing.JTextField();
        btnBuat = new javax.swing.JButton();
        txtTglAkhir = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTglPembuatan = new javax.swing.JTextField();
        panelTable = new javax.swing.JPanel();
        scrollTableData = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();
        btnCetak = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        panelData.setBackground(new java.awt.Color(185, 185, 185));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(149, 2, 179));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUAT VOUCHER");
        jLabel1.setOpaque(true);

        panelForm.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Kode Voucher");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Besar Voucher");

        txtKdVoucher.setBackground(new java.awt.Color(255, 255, 255));
        txtKdVoucher.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtKdVoucher.setForeground(new java.awt.Color(0, 0, 0));
        txtKdVoucher.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtKdVoucher.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(185, 185, 185)));

        txtBesarVoucher.setBackground(new java.awt.Color(255, 255, 255));
        txtBesarVoucher.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtBesarVoucher.setForeground(new java.awt.Color(185, 185, 185));
        txtBesarVoucher.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBesarVoucher.setText("Contoh : 10000");
        txtBesarVoucher.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(185, 185, 185)));
        txtBesarVoucher.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBesarVoucherFocusGained(evt);
            }
        });

        btnBuat.setBackground(new java.awt.Color(149, 2, 179));
        btnBuat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuat.setForeground(new java.awt.Color(255, 255, 255));
        btnBuat.setText("BUAT");
        btnBuat.setBorderPainted(false);
        btnBuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuatActionPerformed(evt);
            }
        });

        txtTglAkhir.setBackground(new java.awt.Color(255, 255, 255));
        txtTglAkhir.setBorder(new javax.swing.border.MatteBorder(null));
        txtTglAkhir.setForeground(new java.awt.Color(0, 0, 0));
        txtTglAkhir.setDateFormatString("yyyy-MM-dd");
        txtTglAkhir.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Tanggal Pembuatan");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Tanggal Berakhir");

        txtTglPembuatan.setBackground(new java.awt.Color(255, 255, 255));
        txtTglPembuatan.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtTglPembuatan.setForeground(new java.awt.Color(0, 0, 0));
        txtTglPembuatan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTglPembuatan.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(185, 185, 185)));

        javax.swing.GroupLayout panelFormLayout = new javax.swing.GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTglAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtKdVoucher)
                            .addComponent(txtTglPembuatan)
                            .addComponent(txtBesarVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelFormLayout.setVerticalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKdVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTglPembuatan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addComponent(txtTglAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)))
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBesarVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuat)
                .addContainerGap())
        );

        panelTable.setBackground(new java.awt.Color(255, 255, 255));

        tableData.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Voucher", "Tanggal Pembuatan", "Tanggal Akhir", "Besar Voucher", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        txtCari.setBackground(new java.awt.Color(255, 255, 255));
        txtCari.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCari.setForeground(new java.awt.Color(185, 185, 185));
        txtCari.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCari.setText("Cari Kode Voucher atau Besar Voucher");
        txtCari.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(185, 185, 185)));
        txtCari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCariFocusGained(evt);
            }
        });

        btnCetak.setBackground(new java.awt.Color(149, 2, 179));
        btnCetak.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCetak.setForeground(new java.awt.Color(255, 255, 255));
        btnCetak.setText("CETAK");
        btnCetak.setBorderPainted(false);
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTableData, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCari)
                .addContainerGap())
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCetak)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollTableData, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDataLayout = new javax.swing.GroupLayout(panelData);
        panelData.setLayout(panelDataLayout);
        panelDataLayout.setHorizontalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1559, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDataLayout.setVerticalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        add(panelData, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatActionPerformed
            if(validasiTambahData()) {
                tambahData();
                clearFieldAll();
                tabmodel.setRowCount(0);
                tampilData();
            }    
    }//GEN-LAST:event_btnBuatActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        int row = tableData.getSelectedRow();
        cetakVoucher(row);
    }//GEN-LAST:event_btnCetakActionPerformed

    private void txtBesarVoucherFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBesarVoucherFocusGained
        txtBesarVoucher.setText("");
        txtBesarVoucher.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_txtBesarVoucherFocusGained

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        int row = tableData.getSelectedRow();
    }//GEN-LAST:event_tableDataMouseClicked

    private void txtCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCariFocusGained
        txtCari.setText("");
        txtCari.setForeground(new Color(0, 0, 0));
        txtCari.setFont(new Font("sansserif", 0, 14));
    }//GEN-LAST:event_txtCariFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuat;
    private javax.swing.JButton btnCetak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel panelData;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelTable;
    private javax.swing.JScrollPane scrollTableData;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtBesarVoucher;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKdVoucher;
    private com.toedter.calendar.JDateChooser txtTglAkhir;
    private javax.swing.JTextField txtTglPembuatan;
    // End of variables declaration//GEN-END:variables

    
//    Tampil Data
    private void tampilData() {
        for(ModelVoucher modelVoucher : controlVoucher.getData()) {
            tabmodel.addRow(new Object[]{
            modelVoucher.getKodeVoucher(),
            modelVoucher.getTglPembuatan(),
            modelVoucher.getTglBerakhir(),
            modelVoucher.getBesarVoucher(),
            modelVoucher.getStatus()
            });
        }
    }
    
    private void instance() {
        try {
            ReportManager.getIntance().compileReport();
        } catch(JRException ex) {
            ex.printStackTrace();
        }
    }
    
//    Cetak Voucher
    private void cetakVoucher(int row) {
        if(row != -1) {
            String tglBerakhir = tableData.getValueAt(row, 2).toString();
            LocalDate lastDate = LocalDate.parse(tglBerakhir);
            LocalDate dateNow = LocalDate.now();
            String status = tableData.getValueAt(row, 4).toString();
            if(dateNow.getYear() > lastDate.getYear() || dateNow.getMonthValue() >= lastDate.getMonthValue() && dateNow.getDayOfMonth() > lastDate.getDayOfMonth()) {
                JOptionPane.showMessageDialog(null, "Tidak dapat mencetak voucher ini\nKarena sudah berkahir");
            } else if(status.equals("Sudah Digunakan")) {
                JOptionPane.showMessageDialog(null, "Tidak dapat mencetak voucher ini\nKarena sudah digunakan");
            } else {
                List<FieldVoucher> fields = new ArrayList<>();
                String besarVoucher = tableData.getValueAt(row, 3).toString();
                fields.add(new FieldVoucher(besarVoucher));
                try {
                    ParamVoucher paramater = new ParamVoucher(generateBarcode(row), tglBerakhir, fields);
                    ReportManager.getIntance().printVoucher(paramater);
                } catch (WriterException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch(JRException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mohon pilih salah satu\nvoucher yang ingin dicetak");
        }
    }
    
    private InputStream generateBarcode(int row) throws WriterException, IOException{
        String kodeVoucher = tableData.getValueAt(row, 0).toString();
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.MARGIN, 0);
        BitMatrix bitMatrix = new MultiFormatWriter().encode(kodeVoucher, BarcodeFormat.CODE_128, 50, 25, hints);
        BufferedImage image = MatrixToImageWriter.toBufferedImage(bitMatrix);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "png", outputStream);
        return new ByteArrayInputStream(outputStream.toByteArray());
    }
        
//    Tambah Layanan
    private void tambahData() {
        String kodeVoucher = txtKdVoucher.getText();
        String tglPembuatan = txtTglPembuatan.getText();
        String tglBerakhir = sdf.format(txtTglAkhir.getDate());
        int besarVoucher = Integer.parseInt(txtBesarVoucher.getText());
        String status = "Belum Digunakan";
        ModelVoucher modelVoucher = new ModelVoucher(kodeVoucher, tglPembuatan, tglBerakhir, besarVoucher, status);
        controlVoucher.addData(modelVoucher);
    }         
    private void clearFieldAll() {
        txtKdVoucher.setText(controlVoucher.autoID());
        txtTglAkhir.setDate(null);
        txtBesarVoucher.setText("Contoh : 10000");  
        txtBesarVoucher.setForeground(new Color(185, 185, 185));
    }
    
    private void enableField() {
        txtKdVoucher.setEnabled(false);
        txtTglPembuatan.setEnabled(false);
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
    
    private boolean validasiTambahData() {
        boolean valid = false;
        try {
            if(txtTglAkhir.getDate().toString().length() == 0) {
                JOptionPane.showMessageDialog(null, "Mohon isi batas masa voucher");
            }
            else if(txtBesarVoucher.getText().equals("Contoh : 10000") || txtBesarVoucher.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Mohon isi besar voucher");
            } else {
                valid = true;
            }   
        } catch(NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Mohon isi batas masa voucher");
        }
        return valid;
    }
        
}