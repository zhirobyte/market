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
import java.util.*;
import  user.LinkedListUser;
import  barang.LinkedListBarang;
import market.Dasboard;
import  relasi.LinkedListRelasi;

public class Transaksi {
    LinkedListBarang linkedListBarang = new LinkedListBarang ();
    LinkedListUser linkedListUser = new LinkedListUser();
    LinkedListRelasi linkedListRelasi = new LinkedListRelasi();
    
    public void member(){
          int pilih = 0;
            linkedListUser.insertUser();  
            System.out.println("");
            System.out.println ("=========== PELANGGAN ========");
            System.out.println ("1. Pelanggan Baru");
            System.out.println ("2. Pelanggan Lama (member)");
            System.out.println("");
            System.out.print("PILIHAN> ");
        
        Scanner input = new Scanner (System.in);
        pilih = input.nextInt();
        
         if(pilih == 1){
             linkedListUser.addNodeUser();
            linkedListUser.printListUser();
        }
        else if(pilih == 2){
          linkedListUser.printListUser();
        }
        else if (pilih == 0){
            System.exit(0);
        }
        else{
            System.out.println("Yang anda masukkan salah");
            member();
        }
        linkedListUser.searchNodeUser();
        linkedListBarang.insertBarang();
        linkedListBarang.printListBarang();
        linkedListBarang.searchNodeBarang();
        beliUlang();
    
    }

    public void beliUlang() {
        Scanner input = new Scanner (System.in);
        int pilih = 0;
        linkedListRelasi.addNodeRelasi();
            System.out.println("");
            System.out.println ("Apakah anda ingin membeli lagi?");
            System.out.println ("1. iya ");
            System.out.println ("2. nggak");
            System.out.println("");
            System.out.print("PILIHAN> ");
            pilih = input.nextInt();
        switch (pilih) {
            case 1:
                linkedListBarang.printListBarang();
                linkedListBarang.searchNodeBarang();
                beliUlang();
                break;
            case 2:
                System.out.println ("Terimaksih");
                linkedListRelasi.printListRiwayat();
                homepage();
                break;
            case 0:
                System.exit(0);
            default:          
             break;
        }
        
    }
    
    
    
      public void searchBy() {
        Scanner input = new Scanner (System.in);
        int pilih = 0;
        do{
            linkedListRelasi.addNodeRelasi();
            System.out.println("");
            System.out.println ("Silahkan pilih filter");
            System.out.println ("1. sort by user");
            System.out.println ("2. sort by barang");
            System.out.println ("3. sort by pembeli-barang");            
            System.out.println ("4. sort by barang-terjual");
            System.out.println("");
            System.out.print("PILIHAN> ");
             pilih = input.nextInt();
             switch(pilih){
                 case 1:
                     linkedListUser.printListUser();
                 break;
                 case 2:
                     linkedListBarang.printListBarang();
                 break;
                 case 3:
                     linkedListRelasi.printListRiwayat();
                     linkedListRelasi.printListRelasi();//print 
                 break;
                 case 4:
                     linkedListBarang.printListBarang();
                 break;
             }
        }while(pilih != 0);  
    }
      
    public void homepage(){
          System.out.println ("Kelompok Algoritma dan Struktur data");
          System.out.println ("Nama Kelompok :");
          System.out.println ("1. Amanda Muchsin Chalik : 1910130004");
          System.out.println ("2. Faiz Hanafi : 1910130008");
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
                        homepage();
                        break;
                    case 2:
                        linkedListBarang.addNodeBarang();
                        homepage();
                        break;
                    case 3:
                        linkedListUser.printListUser();
                        homepage();
                        break;
                    case 4:
                        linkedListBarang.printListBarang();
                        homepage();
                        break;
                    case 5:
                        searchBy();
                        break;
                    case 6:
                        member();
                        break;
                    case 7:                       
                        linkedListRelasi.printListRiwayat();
                        homepage();
                        break;
                    default:
                        System.out.println("Pilihan salah!");    
                }
        }   
}

