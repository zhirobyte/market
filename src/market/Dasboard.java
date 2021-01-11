/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market;

import barang.LinkedListBarang;
import java.util.Scanner;
import relasi.LinkedListRelasi;
import relasi.Transaksi;
import user.LinkedListUser;
/**
 *
 * @author zhirobyte
 */
public class Dasboard {
    
    public static void dashboard(){
          System.out.println ("Kelompok Algoritma dan Struktur data");
          System.out.println ("Nama Kelompok :");
          System.out.println ("1. Amanda Muchsin Chalik : 1910130004");
          System.out.println ("2. Faiz Hanafi : 1910130008");
        
        LinkedListUser linkedListUser = new LinkedListUser();
        LinkedListBarang linkedListBarang = new LinkedListBarang();
        LinkedListRelasi linkedListRelasi = new LinkedListRelasi();
        Transaksi transaksi = new Transaksi();
      
        
        Scanner input = new Scanner (System.in);
        int pilih = 0;
       
            System.out.println("");
            System.out.println ("=========== WELCOME TO PASAR REBO ========");
            System.out.println ("0. exit");
            System.out.println ("1. add User");
            System.out.println ("2. add Barang");
            System.out.println ("3. Tampilkan Seluruh Pembeli");
            System.out.println ("4. Tampilkan Seluruh Barang");
            System.out.println ("5. Search System");
            System.out.println ("6. Transaksi Pembelian");
            System.out.println ("7. Riwayat Pembelian");
            System.out.println("");
            System.out.print("PILIHAN> ");

                pilih = input.nextInt();
                switch (pilih){
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        linkedListUser.addNodeUser();
                        break;
                    case 2:
                        linkedListBarang.addNodeBarang();
                        break;
                    case 3:
                        linkedListUser.printListUser();
                        break;
                    case 4:
                        linkedListBarang.printListBarang();
                        break;
                    case 5:
                        transaksi.searchBy();
                        break;
                    case 6:
                        transaksi.member();
                        break;
                    case 7:                       
                        linkedListRelasi.printListRiwayat();
                        break;
                    default:
                        System.out.println("Pilihan salah!");    
                }
}
}
