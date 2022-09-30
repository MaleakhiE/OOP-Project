package View;

import Controller.ControllerDataBarang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Controller.ControllerDataTransaksi;
import Entity.DataBarang;
import Entity.DataTransaksi;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FormTransaksi extends javax.swing.JFrame {
    private ControllerDataBarang cmdBrg;
    private ControllerDataTransaksi cmdTrs;
   
    public FormTransaksi() {
        initComponents();
        loadData();
        loadData2();
    }
    
    private void loadData(){
        cmdBrg = new ControllerDataBarang();
        Object[][] listBarang = cmdBrg.listBarang();
        for (Object[] id : listBarang){
            cbIDBarang.addItem((String) id[0]);
        }
    }
    
    private void loadData2(){
        cmdBrg = new ControllerDataBarang();
        Object[][] listBarang = cmdBrg.listBarang();
        for (Object[] id : listBarang){
            if (id[0].equals(cbIDBarang.getSelectedItem())){
                txtQuantity.setText(id[2].toString());
            } 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtQuantity = new javax.swing.JTextField();
        btnPrint2 = new javax.swing.JButton();
        btn_Keluar = new javax.swing.JButton();
        iconXena1 = new javax.swing.JLabel();
        txtUang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCoba2 = new javax.swing.JLabel();
        txtCoba1 = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JLabel();
        btnPrint1 = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        cbIDBarang = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMemo = new javax.swing.JTextArea();
        Judul14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtQuantity.setEditable(false);
        txtQuantity.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 50, -1));

        btnPrint2.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        btnPrint2.setText("Cek Harga");
        btnPrint2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 140, 30));

        btn_Keluar.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        btn_Keluar.setText("Kembali");
        btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 120, 40));

        iconXena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images (4).png"))); // NOI18N
        getContentPane().add(iconXena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 380, 110));

        txtUang.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtUang.setText("0");
        txtUang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUangActionPerformed(evt);
            }
        });
        getContentPane().add(txtUang, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 190, -1));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Masukan Uang");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 110, -1));

        txtCoba2.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtCoba2.setForeground(new java.awt.Color(255, 255, 255));
        txtCoba2.setText("Rp.");
        getContentPane().add(txtCoba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 130, 30));

        txtCoba1.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtCoba1.setForeground(new java.awt.Color(255, 255, 255));
        txtCoba1.setText(",-");
        getContentPane().add(txtCoba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 130, 30));

        txtTotalHarga.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtTotalHarga.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalHarga.setText("0");
        getContentPane().add(txtTotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 130, 30));

        btnPrint1.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        btnPrint1.setText("Cetak Struk");
        btnPrint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 140, 30));

        btnPrint.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 90, 30));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Barang");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 90, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 60, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jumlah");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 80, -1));

        txtHarga.setEditable(false);
        txtHarga.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        getContentPane().add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 190, -1));

        txtJumlah.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtJumlah.setText("1");
        txtJumlah.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtJumlahInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });
        getContentPane().add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 190, -1));

        cbIDBarang.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        cbIDBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIDBarangActionPerformed(evt);
            }
        });
        getContentPane().add(cbIDBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 190, 30));

        txtMemo.setEditable(false);
        txtMemo.setColumns(20);
        txtMemo.setRows(5);
        jScrollPane1.setViewportView(txtMemo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 350, 240));

        Judul14.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        Judul14.setForeground(new java.awt.Color(255, 255, 255));
        Judul14.setText("Selamat Datang, Silahkan Berbelanja !");
        getContentPane().add(Judul14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 440, 30));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Harga");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 90, -1));

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 3, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Stock");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 50, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/blackvii_thumbnail.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KeluarActionPerformed
        this.setVisible(false);
        new FormHomepage().setVisible(true);
        JOptionPane.showMessageDialog(null, "Terima Kasih, Sudah Berbelanja!");
    }//GEN-LAST:event_btn_KeluarActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
       try {
            txtMemo.print();
        } catch (PrinterException ex) {
            Logger.getLogger(FormTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed

    }//GEN-LAST:event_txtJumlahActionPerformed

    private void cbIDBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIDBarangActionPerformed
        cmdBrg = new ControllerDataBarang();
        Object[][] listBarang = cmdBrg.listBarang();
        for (Object[] data:listBarang){
            if (data[0].equals(cbIDBarang.getSelectedItem())){
                txtHarga.setText(data[1].toString());
                txtQuantity.setText(data[2].toString());
            } 
        }
        txtTotalHarga.setText("0");
    }//GEN-LAST:event_cbIDBarangActionPerformed

    private void btnPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint1ActionPerformed
        int id_transaksi, jumlahbarang, totalharga, hasil, uang, kembalian, beli, quantity;
        String id_barang;
        jumlahbarang = Integer.parseInt(txtJumlah.getText());
        totalharga = Integer.parseInt(txtTotalHarga.getText());
        id_barang = (String) cbIDBarang.getSelectedItem();
        quantity = Integer.parseInt(txtQuantity.getText());
        uang = Integer.parseInt(txtUang.getText());
        beli = jumlahbarang;
        if (txtQuantity.getText().equals("0")){
            JOptionPane.showMessageDialog(null, "Stock Barang Habis");
        }
        else if (txtTotalHarga.getText().equals("0")){ 
            JOptionPane.showMessageDialog(null, "Tekan Cek Harga Terlebih Dahulu !");
        }
        else {
            if (uang >= totalharga && jumlahbarang >= 1 && jumlahbarang < quantity){
                    kembalian = uang - totalharga;
                    JOptionPane.showMessageDialog(null, "Terima Kasih, Sudah Berbelanja "+id_barang+" Dengan Total Harga Rp."+totalharga);
                    txtMemo.append("------------------------ XENA DISLOCK ALARM ------------------------");
                    txtMemo.append(System.lineSeparator());
                    txtMemo.append("                                                                                "+ java.time.LocalDate.now());
                    txtMemo.append(System.lineSeparator());
                    txtMemo.append("                                                                                "+ java.time.LocalTime.now());
                    txtMemo.append(System.lineSeparator());
                    txtMemo.append("===============================================");
                    txtMemo.append(System.lineSeparator());
                    txtMemo.append("                                Struk Pembelanjaan Xena");
                    txtMemo.append(System.lineSeparator());
                    txtMemo.append(System.lineSeparator());
                    txtMemo.append("                                   "+id_barang+" - "+jumlahbarang+" pcs");
                    txtMemo.append(System.lineSeparator());
                    txtMemo.append(System.lineSeparator());
                    txtMemo.append("===============================================");
                    txtMemo.append(System.lineSeparator());
                    txtMemo.append("                                Jumlah Transaksi  : Rp."+totalharga);
                    txtMemo.append(System.lineSeparator());
                    txtMemo.append("                                Kembalian               : Rp."+kembalian);
                    txtMemo.append(System.lineSeparator());
                    txtMemo.append("------------------- SECURE UR BIKE, USE XENA ! ------------------");
                    Object[][] listBarang = cmdBrg.listBarang(); 
                    for (Object[] data:listBarang){
                        if (data[0].equals(cbIDBarang.getSelectedItem())){
                            txtQuantity.setText(data[2].toString());} 
                    }
                    DataTransaksi trs = new DataTransaksi (jumlahbarang,totalharga,id_barang);
                    cmdTrs = new ControllerDataTransaksi();
                    hasil = cmdTrs.simpanData(trs);
                    DataBarang trans = new DataBarang (id_barang,beli);
                    cmdBrg = new ControllerDataBarang();
                    hasil = cmdBrg.transBrg(trans);
                    loadData2();
            }
            else if (uang < totalharga) {
                 JOptionPane.showMessageDialog(null, "Masukan Uang Dengan Nominal Yang Benar !");
            }
            else if (jumlahbarang < 1){
                JOptionPane.showMessageDialog(null, "Masukan Jumlah Barang Dengan Benar !");
            }
            else if (jumlahbarang > quantity){
                JOptionPane.showMessageDialog(null, "Stock Tidak Mencukupi !");
            }
        }
        txtJumlah.setText("1");
        txtTotalHarga.setText("0");
        txtUang.setText("0");
        
    }//GEN-LAST:event_btnPrint1ActionPerformed

    private void txtJumlahInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtJumlahInputMethodTextChanged

    }//GEN-LAST:event_txtJumlahInputMethodTextChanged

    private void btnPrint2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint2ActionPerformed
        int jumlah,harga,total;
        jumlah = Integer.parseInt(txtJumlah.getText());
        harga = Integer.parseInt(txtHarga.getText());
        total = (jumlah * harga);
        txtTotalHarga.setText(String.valueOf(total));
        txtMemo.setText(null);
    }//GEN-LAST:event_btnPrint2ActionPerformed

    private void txtUangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUangActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul14;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnPrint1;
    private javax.swing.JButton btnPrint2;
    private javax.swing.JButton btn_Keluar;
    private javax.swing.JComboBox<String> cbIDBarang;
    private javax.swing.JLabel iconXena1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtCoba1;
    private javax.swing.JLabel txtCoba2;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextArea txtMemo;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JLabel txtTotalHarga;
    private javax.swing.JTextField txtUang;
    // End of variables declaration//GEN-END:variables
}
