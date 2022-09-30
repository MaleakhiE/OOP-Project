package View;
import javax.swing.JOptionPane;

public class FormBarang extends javax.swing.JFrame {

    public FormBarang() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_belanja = new javax.swing.JButton();
        btn_Keluar = new javax.swing.JButton();
        iconXena1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Judul3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Judul4 = new javax.swing.JLabel();
        Judul5 = new javax.swing.JLabel();
        Judul6 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_belanja.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        btn_belanja.setText("Mulai Belanja");
        btn_belanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_belanjaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_belanja, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 160, 40));

        btn_Keluar.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        btn_Keluar.setText("Kembali");
        btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 150, 40));

        iconXena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images (4).png"))); // NOI18N
        getContentPane().add(iconXena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 400, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/bb.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 220, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/WhatsApp Image 2020-12-07 at 14.54.52.jpeg"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 220, 220));

        Judul3.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        Judul3.setForeground(new java.awt.Color(255, 255, 255));
        Judul3.setText("XZZ6L - Green (Rp.1.100.000,-)");
        getContentPane().add(Judul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 220, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/a.jpeg"))); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 220, 220));

        Judul4.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        Judul4.setForeground(new java.awt.Color(255, 255, 255));
        Judul4.setText("Daftar Barang");
        getContentPane().add(Judul4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 170, 30));

        Judul5.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        Judul5.setForeground(new java.awt.Color(255, 255, 255));
        Judul5.setText("XZZ6L - Black (Rp. 1.250.000,-)");
        getContentPane().add(Judul5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 220, 30));

        Judul6.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        Judul6.setForeground(new java.awt.Color(255, 255, 255));
        Judul6.setText("XZZ6L - SS (Rp.1.500.000,-)");
        getContentPane().add(Judul6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 200, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/blackvii_thumbnail.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KeluarActionPerformed
        this.setVisible(false);
        new FormHomepage().setVisible(true);
    }//GEN-LAST:event_btn_KeluarActionPerformed

    private void btn_belanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_belanjaActionPerformed
        this.setVisible(false);
        new FormTransaksi().setVisible(true);
    }//GEN-LAST:event_btn_belanjaActionPerformed

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
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul3;
    private javax.swing.JLabel Judul4;
    private javax.swing.JLabel Judul5;
    private javax.swing.JLabel Judul6;
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_Keluar;
    private javax.swing.JButton btn_belanja;
    private javax.swing.JLabel iconXena1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
