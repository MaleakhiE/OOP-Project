package View;

import Controller.ControllerDataBarang;
import Controller.ControllerDataTransaksi;
import Entity.DataTransaksi;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormDataTransaksi extends javax.swing.JFrame {
    private ControllerDataTransaksi cmdTrs;
    private ControllerDataBarang cmdBrg;

    /**
     * Creates new form FormDataUser
     */
    public FormDataTransaksi() {
        initComponents();
        loadData();
        loadData2();
    }
    
    private void loadData2(){
        cmdBrg = new ControllerDataBarang();
        Object[][] listBarang = cmdBrg.listBarang();
        for (Object[] id : listBarang){
            cbIdBarang.addItem((String) id[0]);
        }
    }
    
    private void loadData(){
        List<DataTransaksi> lsTrs = new ArrayList<DataTransaksi>();
        cmdTrs = new ControllerDataTransaksi();
        lsTrs = cmdTrs.ambilTrs();
        Object [][] obTrs = new Object [lsTrs.size()][4];
        int i =0;
        for (DataTransaksi trs:lsTrs){
           obTrs[i][0]= trs.getId_transaksi();
           obTrs[i][1]= trs.getId_barang();
           obTrs[i][2]= trs.getJumlahbarang();
           obTrs[i][3]= trs.getTotalharga();
           i++;
        }
        tblDataTransaksi.setModel(new javax.swing.table.DefaultTableModel(obTrs,
                new String [] { "ID_TRANSAKSI","ID_BARANG","JUMLAHBARANG","TOTALHARGA"}));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdTransaksi = new javax.swing.JTextField();
        cbIdBarang = new javax.swing.JComboBox<>();
        btn_Keluar = new javax.swing.JButton();
        iconXena1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Judul3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataTransaksi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtJumlahBarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdTransaksi.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtIdTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdTransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 190, -1));

        cbIdBarang.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        getContentPane().add(cbIdBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 190, 30));

        btn_Keluar.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        btn_Keluar.setText("Keluar");
        btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 100, 40));

        iconXena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images (4).png"))); // NOI18N
        getContentPane().add(iconXena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 400, 160));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 90, -1));

        Judul3.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        Judul3.setForeground(new java.awt.Color(255, 255, 255));
        Judul3.setText("Data Transaksi");
        getContentPane().add(Judul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 180, 30));

        tblDataTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "ID Barang", "Jumlah Barang", "Total Harga"
            }
        ));
        tblDataTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataTransaksi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 470, 200));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Transaksi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 90, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jumlah Barang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 110, -1));

        txtJumlahBarang.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtJumlahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahBarangActionPerformed(evt);
            }
        });
        getContentPane().add(txtJumlahBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 190, -1));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Harga");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        txtTotalHarga.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        getContentPane().add(txtTotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 190, -1));

        btnHapus.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        btnReset.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        btnUbah.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnUbah.setText("Update");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jButton1.setFont(new java.awt.Font("Nirmala UI", 3, 12)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, -1, -1));

        background.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/blackvii_thumbnail.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KeluarActionPerformed
        this.setVisible(false);
        new FormAdmin().setVisible(true);
    }//GEN-LAST:event_btn_KeluarActionPerformed

    private void tblDataTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataTransaksiMouseClicked
        txtIdTransaksi.setEditable(false);
        String id_transaksi,jumlahbarang,totalharga,id_barang;
        int rowSelect;
        rowSelect = tblDataTransaksi.getSelectedRow();
        System.out.println("Baris yang diclick adalah "+rowSelect);
        id_transaksi = tblDataTransaksi.getValueAt(rowSelect, 0).toString();
        id_barang = tblDataTransaksi.getValueAt(rowSelect, 1).toString();
        jumlahbarang = tblDataTransaksi.getValueAt(rowSelect, 2).toString();
        totalharga = tblDataTransaksi.getValueAt(rowSelect, 3).toString();
        cbIdBarang.setSelectedItem(id_barang);
        txtJumlahBarang.setText(jumlahbarang);
        txtTotalHarga.setText(totalharga);
        txtIdTransaksi.setText(id_transaksi);
        loadData();
    }//GEN-LAST:event_tblDataTransaksiMouseClicked

    private void txtJumlahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahBarangActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String id_transaksi;
        int hasil;
        id_transaksi = txtIdTransaksi.getText();
        cmdTrs = new ControllerDataTransaksi();
        hasil = cmdTrs.hapusTrs(id_transaksi);
        JOptionPane.showMessageDialog(null, "Data Transaksi Berhasil "+hasil+" Dihapus!");
        loadData();
        txtJumlahBarang.setText("");
        txtTotalHarga.setText("");
        txtIdTransaksi.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtIdTransaksi.setEditable(true); 
        txtJumlahBarang.setText("");
        txtTotalHarga.setText("");
        txtIdTransaksi.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        int id_transaksi,jumlahbarang,totalharga,hasil;
        String id_barang;
        id_transaksi = Integer.parseInt(txtIdTransaksi.getText());
        jumlahbarang = Integer.parseInt(txtJumlahBarang.getText());
        totalharga = Integer.parseInt(txtTotalHarga.getText());
        id_barang = ((String) cbIdBarang.getSelectedItem());
        DataTransaksi trs = new DataTransaksi (id_transaksi,jumlahbarang,totalharga,id_barang);
        cmdTrs = new ControllerDataTransaksi();
        hasil = cmdTrs.ubahTrs(trs);
        JOptionPane.showMessageDialog(null, "Data Barang Berhasil "+hasil+" Diubah!");
        loadData();
        txtJumlahBarang.setText("");
        txtTotalHarga.setText("");
        txtIdTransaksi.setText("");
    }//GEN-LAST:event_btnUbahActionPerformed

    private void txtIdTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdTransaksiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            tblDataTransaksi.print();
        } catch (PrinterException ex) {
            Logger.getLogger(FormDataTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormDataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul3;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton btn_Keluar;
    private javax.swing.JComboBox<String> cbIdBarang;
    private javax.swing.JLabel iconXena1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDataTransaksi;
    private javax.swing.JTextField txtIdTransaksi;
    private javax.swing.JTextField txtJumlahBarang;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
