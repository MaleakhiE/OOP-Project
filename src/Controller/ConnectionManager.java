package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    private Connection con;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/tugasoop";
    private String username = "root";
    private String password = "";
    
    public Connection logOn(){
        try{
            //Load JDBC Driver
            Class.forName(driver).newInstance();
            //Buat object connection
            con = DriverManager.getConnection(url, username, password);
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop?user=root&password=""");
            System.out.println(con);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return con;
    }
    
    public void logOff(){
        try{
            //Tutup koneksi
            con.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}