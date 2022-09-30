/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;


public class FormHomepage extends javax.swing.JFrame {

    public FormHomepage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Keluar = new javax.swing.JButton();
        iconXena1 = new javax.swing.JLabel();
        rbDataBarang = new javax.swing.JRadioButton();
        rbDataTransaksi = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Judul3 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Keluar.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        btn_Keluar.setText("Sign Out");
        btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 120, 40));

        iconXena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images (4).png"))); // NOI18N
        getContentPane().add(iconXena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 400, 160));

        rbDataBarang.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        rbDataBarang.setForeground(new java.awt.Color(255, 255, 255));
        rbDataBarang.setText("Transaksi");
        rbDataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDataBarangActionPerformed(evt);
            }
        });
        getContentPane().add(rbDataBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 120, -1));

        rbDataTransaksi.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        rbDataTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        rbDataTransaksi.setText("Tampilan Barang");
        rbDataTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDataTransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(rbDataTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/download (6).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 240, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/keranjang.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 230, 200));

        Judul3.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        Judul3.setForeground(new java.awt.Color(255, 255, 255));
        Judul3.setText("Selamat Datang !");
        getContentPane().add(Judul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 290, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/blackvii_thumbnail.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KeluarActionPerformed
        this.setVisible(false);
        new FormLogin().setVisible(true);
        JOptionPane.showMessageDialog(null, "Terima Kasih, Sudah Berbelanja!");
    }//GEN-LAST:event_btn_KeluarActionPerformed

    private void rbDataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDataBarangActionPerformed
        this.setVisible(false);
        new FormTransaksi().setVisible(true);
    }//GEN-LAST:event_rbDataBarangActionPerformed

    private void rbDataTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDataTransaksiActionPerformed
        this.setVisible(false);
        new FormBarang().setVisible(true);
    }//GEN-LAST:event_rbDataTransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(FormHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul3;
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_Keluar;
    private javax.swing.JLabel iconXena1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rbDataBarang;
    private javax.swing.JRadioButton rbDataTransaksi;
    // End of variables declaration//GEN-END:variables
}
