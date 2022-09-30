package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Entity.DataBarang;

public class ControllerDataBarang {
    private ConnectionManager conMan;
    private Connection conn;
    private Statement stm;
    private ResultSet rs;
    //Menyimpan semua method CRUD
    //Create -> Insert (Berdasarkan query atau berdasarkan objek attribute
    //yang ditangkap oleh method
    public int simpanData(DataBarang db) {
        int hasil = 0;
        String query = "INSERT INTO data_barang(id_barang,harga,quantity,beli) "
                + "values('"+ db.getId_barang() +"', "+ db.getHarga() +", "+ db.getQuantity() 
                +", "+ db.getBeli()+")";
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerDataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public int simpanData(String id_barang, int harga, int quantity, int beli) {
        int hasil = 0;
        String query = "INSERT INTO data_barang(id_barang,harga,quantity,beli) "
                + "values('"+ id_barang +"', "+ harga +", "+ quantity 
                +", "+ beli+")";
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerDataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public List<DataBarang> ambilBrg() {
     String query = "Select *from data_barang";
     List<DataBarang> lsBrg = new ArrayList<DataBarang>();
     conMan = new ConnectionManager();
     conn = conMan.logOn();
     try {
         stm = conn.createStatement();
         rs = stm.executeQuery(query);
         while (rs.next()){
            DataBarang db = new DataBarang();
            db.setId_barang(rs.getString("id_barang"));
            db.setHarga(rs.getInt("harga"));
            db.setQuantity(rs.getInt("quantity"));
            db.setBeli(rs.getInt("beli"));
            lsBrg.add(db);
         }
         conMan.logOff();
     }catch (SQLException ex){
          Logger.getLogger(ControllerDataBarang.class.getName()).log(Level.SEVERE, null, ex);
     }
     return lsBrg;
    }
    
    public int ubahBrg (DataBarang db){
        int hasil = 0;
        String query = "Update data_barang set beli = "+db.getBeli()+", harga = "+db.getHarga()+","
                + " quantity = "+db.getQuantity()+" where id_barang = '"+db.getId_barang()+"'";
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerDataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public int hapusBrg (String id_barang){
        String query = "Delete from data_barang where id_barang = '"+ id_barang +"'";
        int hasil = 0;
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerDataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public int transBrg (DataBarang db){
        int hasil = 0;
        String query = "Update data_barang set beli = beli + "+db.getBeli()+", quantity = quantity - "+db.getBeli()+"  where id_barang = '"+db.getId_barang()+"'";
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerDataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
      
    public Object[][] listBarang(){
        ControllerDataBarang lB = new ControllerDataBarang();
        List<DataBarang> listBarang = lB.ambilBrg();
        Object[][] dataBarang = new Object[listBarang.size()][4];
        int mySize = 0;
        for (DataBarang barang: listBarang){
            dataBarang[mySize][0] = barang.getId_barang();
            dataBarang[mySize][1] = barang.getHarga();
            dataBarang[mySize][2] = barang.getQuantity();
            dataBarang[mySize][3] = barang.getBeli();
            mySize++;
        }
        return dataBarang;
    }
    
}