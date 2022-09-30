package Entity;
public class DataUser {
    private int ID_Akun;
    private String Username, Password, Level ;

    public DataUser() {
    }
    public DataUser(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }
    public DataUser(int ID_Akun, String Username, String Password, String Level) {
        this.ID_Akun = ID_Akun;
        this.Username = Username;
        this.Password = Password;
        this.Level = Level;
    }
    public int getID_Akun() {
        return ID_Akun;
    }
    public void setID_Akun(int ID_Akun) {
        this.ID_Akun = ID_Akun;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String Username) {
        this.Username = Username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getLevel() {
        return Level;
    }
    public void setLevel(String Level) {
        this.Level = Level;
    }
    @Override
    public String toString() {
        return "DataUser{" + "ID_Akun=" + ID_Akun + ", Username=" + Username + ", Password=" + Password + ", Level=" + Level + '}';
    }
    
    
}
