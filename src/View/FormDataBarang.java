package View;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Controller.ControllerDataBarang;
import Entity.DataBarang;
import Controller.ControllerDataBarang;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FormDataBarang extends javax.swing.JFrame {
    private ControllerDataBarang cmdBrg;
    
    public FormDataBarang() {
        initComponents();
        loadData();;
    }
    
    private void loadData(){
        List<DataBarang> lsBrg = new ArrayList<DataBarang>();
        cmdBrg = new ControllerDataBarang();
        lsBrg = cmdBrg.ambilBrg();
        Object [][] obBrg = new Object [lsBrg.size()][4];
        int i =0;
        for (DataBarang brg:lsBrg){
           obBrg[i][0]= brg.getId_barang();
           obBrg[i][1]= brg.getHarga();
           obBrg[i][2]= brg.getQuantity();
           obBrg[i][3]= brg.getBeli();
           i++;
        }
        tblDataBarang.setModel(new javax.swing.table.DefaultTableModel(obBrg,
                new String [] {"ID_BARANG","HARGA","QUANTITY","BELI"}));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Keluar = new javax.swing.JButton();
        iconXena1 = new javax.swing.JLabel();
        Judul3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataBarang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        txtIdBarang = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTerjual = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnHapus1 = new javax.swing.JButton();
        btnSimpan1 = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Keluar.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        btn_Keluar.setText("Keluar");
        btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 100, 40));

        iconXena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images (4).png"))); // NOI18N
        getContentPane().add(iconXena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 400, 160));

        Judul3.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        Judul3.setForeground(new java.awt.Color(255, 255, 255));
        Judul3.setText("Data Barang");
        getContentPane().add(Judul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 160, 30));

        tblDataBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Barang", "Harga", "Quantity", "Terjual"
            }
        ));
        tblDataBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataBarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 470, 190));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Barang");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 90, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 60, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 80, -1));

        txtHarga.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        getContentPane().add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 190, -1));

        txtIdBarang.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtIdBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBarangActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 190, -1));

        txtQuantity.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 190, -1));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Terjual");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 70, -1));

        txtTerjual.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        getContentPane().add(txtTerjual, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 190, -1));

        btnHapus.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        btnHapus1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnHapus1.setText("Reset");
        btnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        btnSimpan1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnSimpan1.setText("Simpan");
        btnSimpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpan1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        btnUbah.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnUbah.setText("Update");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jButton1.setFont(new java.awt.Font("Nirmala UI", 3, 12)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, -1, -1));

        background.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/blackvii_thumbnail.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KeluarActionPerformed
        this.setVisible(false);
        new FormAdmin().setVisible(true);
    }//GEN-LAST:event_btn_KeluarActionPerformed

    private void tblDataBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataBarangMouseClicked
        txtIdBarang.setEditable(false);
        String id_barang,harga,quantity,beli;
        int rowSelect;
        rowSelect = tblDataBarang.getSelectedRow();
        System.out.println("Baris yang diclick adalah "+rowSelect);
        id_barang = tblDataBarang.getValueAt(rowSelect, 0).toString();
        harga = tblDataBarang.getValueAt(rowSelect, 1).toString();
        quantity = tblDataBarang.getValueAt(rowSelect, 2).toString();
        beli = tblDataBarang.getValueAt(rowSelect, 3).toString();
        txtIdBarang.setText(id_barang);
        txtHarga.setText(harga);
        txtQuantity.setText(quantity);
        txtTerjual.setText(beli);
        loadData();
    }//GEN-LAST:event_tblDataBarangMouseClicked

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtIdBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBarangActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String id_barang;
        int hasil;
        id_barang = txtIdBarang.getText();
        cmdBrg = new ControllerDataBarang();
        hasil = cmdBrg.hapusBrg(id_barang);
        JOptionPane.showMessageDialog(null, "Data Barang Berhasil "+hasil+" Dihapus!");
        loadData();
        txtIdBarang.setText("");
        txtHarga.setText("");
        txtQuantity.setText("");
        txtTerjual.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus1ActionPerformed
        txtIdBarang.setEditable(true);
        txtIdBarang.setText("");
        txtHarga.setText("");
        txtQuantity.setText("");
        txtTerjual.setText("");
    }//GEN-LAST:event_btnHapus1ActionPerformed

    private void btnSimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpan1ActionPerformed
        String id_barang;
        int harga,quantity,beli,hasil;
        id_barang = txtIdBarang.getText();
        harga = Integer.parseInt(txtHarga.getText());
        quantity = Integer.parseInt(txtQuantity.getText());
        beli = Integer.parseInt(txtTerjual.getText());
        DataBarang brg = new DataBarang (id_barang,harga,quantity,beli);
        cmdBrg = new ControllerDataBarang();
        hasil = cmdBrg.simpanData(brg);
        JOptionPane.showMessageDialog(null, "Data Barang Berhasil "+hasil+" Disimpan!");
        loadData();
        txtIdBarang.setText("");
        txtHarga.setText("");
        txtQuantity.setText("");
        txtTerjual.setText("");
    }//GEN-LAST:event_btnSimpan1ActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        String id_barang;
        int harga,quantity,beli,hasil;
        id_barang = txtIdBarang.getText();
        harga = Integer.parseInt(txtHarga.getText());
        quantity = Integer.parseInt(txtQuantity.getText());
        beli = Integer.parseInt(txtTerjual.getText());
        DataBarang brg = new DataBarang (id_barang,harga,quantity,beli);
        cmdBrg = new ControllerDataBarang();
        hasil = cmdBrg.ubahBrg(brg);
        JOptionPane.showMessageDialog(null, "Data Barang Berhasil "+hasil+" Diubah!");
        loadData();
        txtIdBarang.setText("");
        txtHarga.setText("");
        txtQuantity.setText("");
        txtTerjual.setText("");
    }//GEN-LAST:event_btnUbahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            tblDataBarang.print();
        } catch (PrinterException ex) {
            Logger.getLogger(FormDataBarang.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(FormDataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul3;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapus1;
    private javax.swing.JButton btnSimpan1;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton btn_Keluar;
    private javax.swing.JLabel iconXena1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDataBarang;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdBarang;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTerjual;
    // End of variables declaration//GEN-END:variables
}
