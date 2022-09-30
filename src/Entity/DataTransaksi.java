package Entity;
public class DataTransaksi {
   private int id_transaksi, jumlahbarang, totalharga;
   private String id_barang;
    public DataTransaksi() {
    }
    public DataTransaksi(int id_transaksi, int jumlahbarang, int totalharga, String id_barang) {
        this.id_transaksi = id_transaksi;
        this.jumlahbarang = jumlahbarang;
        this.totalharga = totalharga;
        this.id_barang = id_barang;
    }
    public DataTransaksi(int jumlahbarang, int totalharga, String id_barang) {
        this.jumlahbarang = jumlahbarang;
        this.totalharga = totalharga;
        this.id_barang = id_barang;
    }
    public String getId_barang() {
        return id_barang;
    }
    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
    }
    public int getId_transaksi() {
        return id_transaksi;
    }
    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }
    public int getJumlahbarang() {
        return jumlahbarang;
    }
    public void setJumlahbarang(int jumlahbarang) {
        this.jumlahbarang = jumlahbarang;
    }
    public int getTotalharga() {
        return totalharga;
    }
    public void setTotalharga(int totalharga) {
        this.totalharga = totalharga;
    }
    @Override
    public String toString() {
        return "DataTransaksi{" + "id_transaksi=" + id_transaksi + ", jumlahbarang=" + jumlahbarang + ", totalharga=" + totalharga + '}';
    }
   
   
   
}
