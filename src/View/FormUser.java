package View;

import Controller.ControllerUser;
import Entity.DataUser;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FormUser extends javax.swing.JFrame {
    private ControllerUser cmdUs;
    
    public FormUser() {
        initComponents();
        loadData();
    }
    
    private void loadData(){
        List<DataUser> lsUs = new ArrayList<DataUser>();
        cmdUs = new ControllerUser();
        lsUs = cmdUs.ambilData();
        Object [][] obUs = new Object [lsUs.size()][4];
        int i =0;
        for (DataUser user:lsUs){
           obUs[i][0]= user.getID_Akun();
           obUs[i][1]= user.getUsername();
           obUs[i][2]= user.getPassword();
           obUs[i][3]= user.getLevel();
           i++;
        }
        tblDataUser.setModel(new javax.swing.table.DefaultTableModel(obUs,
                new String [] { "ID_AKUN","USERNAME","PASSWORD","LEVEL"}));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Keluar = new javax.swing.JButton();
        iconXena1 = new javax.swing.JLabel();
        Judul3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataUser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdAkun = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnHapus1 = new javax.swing.JButton();
        btnSimpan1 = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        cbLevel = new javax.swing.JComboBox<>();
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
        Judul3.setText("User Management");
        getContentPane().add(Judul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 220, 30));

        tblDataUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Akun", "Username", "Password", "Level"
            }
        ));
        tblDataUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataUser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 470, 190));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Akun");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 90, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Level");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 60, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 80, -1));

        txtIdAkun.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtIdAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAkunActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 190, -1));

        txtUsername.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 190, -1));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 70, -1));

        txtPassword.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 190, -1));

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

        cbLevel.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        cbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));
        getContentPane().add(cbLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 190, 30));

        background.setFont(new java.awt.Font("Nirmala UI", 3, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/blackvii_thumbnail.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KeluarActionPerformed
        this.setVisible(false);
        new FormAdmin().setVisible(true);
    }//GEN-LAST:event_btn_KeluarActionPerformed

    private void tblDataUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataUserMouseClicked
        txtIdAkun.setEditable(false);
        String id_akun,username,password,status;
        int rowSelect;
        rowSelect = tblDataUser.getSelectedRow();
        System.out.println("Baris yang diclick adalah "+rowSelect);
        id_akun = tblDataUser.getValueAt(rowSelect, 0).toString();
        username = tblDataUser.getValueAt(rowSelect, 1).toString();
        password = tblDataUser.getValueAt(rowSelect, 2).toString();
        status = tblDataUser.getValueAt(rowSelect, 3).toString();
        txtIdAkun.setText(id_akun);
        txtUsername.setText(username);
        txtPassword.setText(password);
        cbLevel.setSelectedItem(status);
        loadData();
    }//GEN-LAST:event_tblDataUserMouseClicked

    private void txtIdAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAkunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAkunActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String id_akun;
        int hasil;
        id_akun = txtIdAkun.getText();
        cmdUs = new ControllerUser();
        hasil = cmdUs.hapusUs(id_akun);
        JOptionPane.showMessageDialog(null, "Data Barang Berhasil "+hasil+" Dihapus!");
        loadData();
        txtIdAkun.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus1ActionPerformed
        txtIdAkun.setEditable(true);
        txtIdAkun.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnHapus1ActionPerformed

    private void btnSimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpan1ActionPerformed
        String username,password,level;
        int id_akun, hasil;
        id_akun = Integer.parseInt(txtIdAkun.getText());
        level = (String) cbLevel.getSelectedItem();
        username = txtUsername.getText();
        password = txtPassword.getText();
        DataUser user = new DataUser (id_akun,username,password,level);
        cmdUs = new ControllerUser();
        hasil = cmdUs.simpanData(user);
        JOptionPane.showMessageDialog(null, "Data Barang Berhasil "+hasil+" Disimpan!");
        loadData();
        txtIdAkun.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnSimpan1ActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        String username,password,level;
        int id_akun,hasil;
        id_akun = Integer.parseInt(txtIdAkun.getText());
        level = (String) cbLevel.getSelectedItem();
        username = txtUsername.getText();
        password = txtPassword.getText();
        DataUser user = new DataUser (id_akun,username,password,level);
        cmdUs = new ControllerUser();
        hasil = cmdUs.ubahUs(user);
        JOptionPane.showMessageDialog(null, "Data Barang Berhasil "+hasil+" Disimpan!");
        loadData();
        txtIdAkun.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnUbahActionPerformed

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
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUser().setVisible(true);
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
    private javax.swing.JComboBox<String> cbLevel;
    private javax.swing.JLabel iconXena1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDataUser;
    private javax.swing.JTextField txtIdAkun;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
