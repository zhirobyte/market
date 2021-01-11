/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barang;

import barang.*;

/**
 *
 * @author muchsin
 */
public class Barang {
    final String merk;
    final String nama;
    final int harga;
    
    public Barang(String merk, String nama, int harga){
        this.merk = merk;
        this.nama = nama;
        this.harga = harga;
    
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
