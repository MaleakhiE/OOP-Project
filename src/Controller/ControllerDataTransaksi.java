package Controller;

import Entity.DataTransaksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerDataTransaksi {
 private ConnectionManager conMan;
    private Connection conn;
    private Statement stm;
    private ResultSet rs;
    //Menyimpan semua method CRUD
    //Create -> Insert (Berdasarkan query atau berdasarkan objek attribute
    //yang ditangkap oleh method
    public int simpanData(DataTransaksi dt) {
        int hasil = 0;
        String query = "INSERT INTO transaksi(id_transaksi,id_barang,jumlahbarang,totalharga) "
                + "values("+dt.getId_transaksi()+",'"+dt.getId_barang()+"', "+ dt.getJumlahbarang()+", "+ dt.getTotalharga()+")";
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerDataTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public int simpanData(String id_barang, int id_transaksi, int jumlahbarang, int totalharga ) {
        int hasil = 0;
        String query = "INSERT INTO transaksi(id_transaksi, id_barang, jumlahbarang, totalharga) "
                + "values("+id_transaksi +", '"+id_barang+"', "+ jumlahbarang +", "+ totalharga +")";
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerDataTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public List<DataTransaksi> ambilTrs() {
     String query = "Select *from transaksi";
     List<DataTransaksi> lsTrs = new ArrayList<DataTransaksi>();
     conMan = new ConnectionManager();
     conn = conMan.logOn();
     try {
         stm = conn.createStatement();
         rs = stm.executeQuery(query);
         while (rs.next()){
            DataTransaksi dt = new DataTransaksi();
            dt.setId_transaksi(rs.getInt("id_transaksi"));
            dt.setJumlahbarang(rs.getInt("jumlahbarang"));
            dt.setTotalharga(rs.getInt("totalharga"));
            dt.setId_barang(rs.getString("id_barang"));
            lsTrs.add(dt);
         }
         conMan.logOff();
     }catch (SQLException ex){
          Logger.getLogger(ControllerDataTransaksi.class.getName()).log(Level.SEVERE, null, ex);
     }
     return lsTrs;
    }
    
    public int ubahTrs (DataTransaksi dt){
        int hasil = 0;
        String query = "Update transaksi set jumlahbarang = "+dt.getJumlahbarang()+", totalharga = "+dt.getTotalharga()+ ", id_barang = '"+dt.getId_barang()+"' where id_transaksi = "+dt.getId_transaksi()+"";
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerDataTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public int hapusTrs (String id_transaksi){
        String query = "Delete from transaksi where id_transaksi = '"+ id_transaksi +"'";
        int hasil = 0;
        conMan = new ConnectionManager();
        conn = conMan.logOn();
        try{
            stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            conMan.logOff();
        }catch (SQLException ex){
            Logger.getLogger(ControllerDataTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
   
}