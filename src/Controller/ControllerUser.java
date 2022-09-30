package Controller;

import Entity.DataUser;
import View.FormAdmin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import View.FormLogin;
import View.FormTransaksi;
import javax.swing.JOptionPane;

public class ControllerUser {
    private ConnectionManager conMan;
    private Connection conn;
    private Statement stm;
    private ResultSet rs;
    
    public List<DataUser> ambilData() {
     String query = "Select *from daftar_akun";
     List<DataUser> lsUs = new ArrayList<DataUser>();
     conMan = new ConnectionManager();
     conn = conMan.logOn();
     try {
         stm = conn.createStatement();
         rs = stm.executeQuery(query);
         while (rs.next()){
            DataUser du = new DataUser();
            du.setID_Akun(rs.getInt("id_akun"));
            du.setUsername(rs.getString("username"));
            du.setPassword(rs.getString("password"));
            du.setLevel(rs.getString("status"));
            lsUs.add(du);
         }
         conMan.logOff();
     }catch (SQLException ex){
          Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
     }
     return lsUs;
    }
    
    public Object[][] listUser(){
        ControllerUser user = new ControllerUser();
        List<DataUser> listUser = user.ambilData();
        Object[][] datatrans = new Object[listUser.size()][4];
        int mySize = 0;
        for (DataUser userr: listUser){
            datatrans[mySize][0] = userr.getID_Akun();
            datatrans[mySize][1] = userr.getUsername();
            datatrans[mySize][2] = userr.getPassword();
            datatrans[mySize][3] = userr.getLevel();
            mySize++;
        }
        return datatrans;
    }
    
     public int simpanData(DataUser du) {
        int hasil = 0;
        String query = "INSERT INTO daftar_akun(id_akun,username,password,status) "
                + "values("+du.getID_Akun()+", '"+ du.getUsername()+"', '"+ du.getPassword()+"', '"+du.getLevel()+"')";
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public int simpanData(int id_akun, String username, String password, String level ) {
        int hasil = 0;
        String query = "INSERT INTO daftar_akun(id_akun, username, password, status) "
                + "values("+id_akun +", '"+ username +"', '"+ password +"', '"+level+"')";
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public int ubahUs (DataUser du){
        int hasil = 0;
        String query = "Update daftar_akun set username = '"+du.getUsername()+"', password = '"+du.getPassword()+ "', status = '"+du.getLevel()+"' where id_akun = "+du.getID_Akun()+"";
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public int hapusUs (String id_akun){
        String query = "Delete from daftar_akun where id_akun = "+ id_akun +"";
        int hasil = 0;
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public int simpanUser(DataUser du) {
        int hasil = 0;
        String query = "INSERT INTO daftar_akun(id_akun,username,password,status) "
                + "values("+du.getID_Akun()+", '"+ du.getUsername()+"', '"+ du.getPassword()+"', ' user ')";
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
}
