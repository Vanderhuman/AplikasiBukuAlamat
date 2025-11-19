/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author USER
 */
public class Kontak {
    private int id;
    private String nama;
    private String nomorTelepon;
    private String email;
    private String alamat;

    public Kontak(int id, String nama, String nomorTelepon, String email, String alamat)
{
 this.id = id;
 this.nama = nama;
 this.nomorTelepon = nomorTelepon;
 this.email = email;
 this.alamat = alamat;
}

    Kontak() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
// Getters dan setters
public int getId() {
 return id;
}
public void setId(int id) {
 this.id = id;
}
public String getNama() {
 return nama;
}
public void setNama(String nama) {
 this.nama = nama;
}
public String getNomorTelepon() {
 return nomorTelepon;
}
public void setNomorTelepon(String nomorTelepon) {
 this.nomorTelepon = nomorTelepon;
}

    public String getEmail() {
        return email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

public void setEmail(String email){
    this.email = email;
}
}

