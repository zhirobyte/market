/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relasi;

/**
 *
 * @author muchsin
 */
public class Relasi {
    //===Relasi User===//
    final String akun;
    final String gender;
    final String usia;
    //===Relasi Barang===//
    final String nama;
    final String merk;
    final int harga;
    
    public Relasi(String akun, String gender, String usia, String nama, String merk, int harga ){
        this.akun = akun;
        this.gender = gender;
        this.usia = usia;
        
        this.nama = nama;
        this.harga = harga;
        this.merk = merk;
    }

    public String getAkun() {
        return akun;
    }
    
    public String getGender() {
        return gender;
    }
    
    public String getUsia() {
        return usia;
    }
    
    public String getNama() {
    return nama;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public String getMerk() {
        return merk;
    }
}
