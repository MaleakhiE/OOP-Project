package View;

import Controller.ControllerUser;
import Entity.DataUser;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {
    private ControllerUser cmdUs;
    
    public FormLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Judul1 = new javax.swing.JLabel();
        Judul2 = new javax.swing.JLabel();
        Judul3 = new javax.swing.JLabel();
        btn_Daftar = new javax.swing.JButton();
        btn_Login = new javax.swing.JButton();
        iconXena1 = new javax.swing.JLabel();
        edt_Username = new javax.swing.JTextField();
        edt_Password = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Judul1.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        Judul1.setForeground(new java.awt.Color(255, 255, 255));
        Judul1.setText("Password");
        getContentPane().add(Judul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 120, 30));

        Judul2.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        Judul2.setForeground(new java.awt.Color(255, 255, 255));
        Judul2.setText("Selamat Datang, Silahkan Login !");
        getContentPane().add(Judul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 390, 30));

        Judul3.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        Judul3.setForeground(new java.awt.Color(255, 255, 255));
        Judul3.setText("Username");
        getContentPane().add(Judul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 120, 30));

        btn_Daftar.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        btn_Daftar.setText("Daftar");
        btn_Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DaftarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 100, 40));

        btn_Login.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 100, 40));

        iconXena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images (4).png"))); // NOI18N
        getContentPane().add(iconXena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 400, 160));

        edt_Username.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        edt_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(edt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 160, 30));

        edt_Password.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        edt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(edt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 160, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/blackvii_thumbnail.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edt_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_UsernameActionPerformed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        String username, password;
        int hasil;
        username = edt_Username.getText();
        password = edt_Password.getText();
        Boolean login = false;
        ControllerUser cmdUs = new ControllerUser();
        Object[][] listUser = cmdUs.listUser();
        if(username.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Silahkan Isi Username");
        }else{
            for (Object[] listUser1 : listUser) {
                if (username.equals(listUser1[1]) && password.equals(listUser1[2]) 
                        && listUser1[3].equals("admin")) {
                    this.setVisible(false);
                    new FormAdmin().setVisible(true);
                    login = true;
                    break;
                } else if (username.equals(listUser1[1]) && password.equals(listUser1[2])) {
                    this.setVisible(false);
                    new FormHomepage().setVisible(true);
                    login = true;
                    break;
                }     
            }
            if (login){
                JOptionPane.showMessageDialog(rootPane, "Selamat Datang!");            
            }else{
                JOptionPane.showMessageDialog(rootPane, "Username / Password Salah");
                edt_Username.setText("");
                edt_Password.setText("");
            }
        }             
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void btn_DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DaftarActionPerformed
        this.setVisible(false);
        new FormDaftar().setVisible(true);
    }//GEN-LAST:event_btn_DaftarActionPerformed

    private void edt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_PasswordActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul1;
    private javax.swing.JLabel Judul2;
    private javax.swing.JLabel Judul3;
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_Daftar;
    private javax.swing.JButton btn_Login;
    private javax.swing.JPasswordField edt_Password;
    private javax.swing.JTextField edt_Username;
    private javax.swing.JLabel iconXena1;
    // End of variables declaration//GEN-END:variables
}
