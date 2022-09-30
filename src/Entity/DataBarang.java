package Entity;

public class DataBarang {
    private String id_barang;
    private int harga,quantity, beli;

    public DataBarang() {
    }

    public DataBarang(String id_barang) {
        this.id_barang = id_barang;
    }

    public DataBarang(String id_barang, int harga, int quantity, int beli) {
        this.id_barang = id_barang;
        this.harga = harga;
        this.quantity = quantity;
        this.beli = beli;
    }

    public DataBarang(String id_barang, int beli) {
        this.id_barang = id_barang;
        this.beli = beli;
    }    

    public String getId_barang() {
        return id_barang;
    }

    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBeli() {
        return beli;
    }

    public void setBeli(int beli) {
        this.beli = beli;
    }

    @Override
    public String toString() {
        return "DataBarang{" + "id_barang=" + id_barang + ", harga=" + harga + ", quantity=" + quantity + ", beli=" + beli + '}';
    }
    
    
}
