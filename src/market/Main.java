/*
 * //////////////////////////////////////////////////////////////////////
 * "Kelompok Algoritma dan Struktur data"
 * "Nama Kelompok :"
 * 1. Amanda Muchsin Chalik : 1910130004
 * 2. Faiz Hanafi : 1910130008
 * //////////////////////////////////////////////////////////////////////
 */
package market;


/**
 *
 * @author muchsin
 */
import barang.LinkedListBarang;
import static market.Dasboard.dashboard;
import user.LinkedListUser;


public class Main {
    public static void main (String [] args){
         LinkedListUser linkedListUser = new LinkedListUser();
        LinkedListBarang linkedListBarang = new LinkedListBarang();
        linkedListUser.insertUser();
        linkedListBarang.insertBarang();
     dashboard();  
    }
}
