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
import user.LinkedListUser;
import barang.LinkedListBarang;

public class LinkedListRelasi {
    private NodeRelasi head = null;
    private NodeRelasi tail = null;
    private int t;
    private int sum = 0;
         
      
   public void addNodeRelasi(){
        LinkedListUser data = new LinkedListUser();
        String new_akun = data.a;
        String new_gender = data.g;
        String new_usia = data.u;
        
        LinkedListBarang nilai = new LinkedListBarang();
        String new_nama = nilai.nama;
        String new_merk = nilai.merk;
        int new_harga = nilai.harga;
        
	NodeRelasi new_NodeRelasi = new NodeRelasi(); 
        Relasi relasi = new Relasi(new_akun, new_gender, new_usia, new_nama, new_merk, new_harga);
        
		NodeRelasi last = head;
                new_NodeRelasi.setRelasi(relasi);
		new_NodeRelasi.next = null; 

		if (head == null) { 
			new_NodeRelasi.prev = null; 
			head = new_NodeRelasi; 
			return; 
		} 

		while (last.next != null) 
			last = last.next; 

		last.next = new_NodeRelasi; 

		new_NodeRelasi.prev = last; 
	}
   
   
   public void printListRelasi() {         
         NodeRelasi data = head;
            int i = 1;
	NodeRelasi last = null; 
	while (data != null) {
            
            System.out.println ("=========== CHECKOUT ========");
            System.out.println ("");
            System.out.println ("NAMA PELANGGAN :" +data.getRelasi().akun);
            System.out.println ("GENDER         :" +data.getRelasi().usia);
            System.out.println ("USIA           :" +data.getRelasi().gender);
            System.out.println ("------  BARANG PEMBELIAN  ----");
            System.out.println ("Nama :"+data.getRelasi().nama+"/"+data.getRelasi().merk+"/RP."+data.getRelasi().harga);
            System.out.println ("");
            System.out.println("");
            
		last = data;
		data = data.getNext(); 
	} 
            System.out.println("=================================");
    }
   
   
   public void insertNodeRelasi(Relasi relasi){        
        NodeRelasi new_NodeRelasi = new NodeRelasi(); 
    	NodeRelasi last = head;
                new_NodeRelasi.setRelasi(relasi);
		new_NodeRelasi.setPrev (null); 

		if (head == null) { 
			new_NodeRelasi.prev = null; 
			head = new_NodeRelasi; 
			return; 
		} 
		while (last.next != null) 
			last = last.next; 

		last.next = new_NodeRelasi; 
		new_NodeRelasi.prev = last;
                
    }
 
      public void printListRiwayat() {          
         NodeRelasi data = head;
            int i = 1;
        
        System.out.println("=======================================================================");
        System.out.println("|"+"NO"+"|"+"NAMA"+"\t"+"|"+"USIA"+"\t"+"|"+"GENDER"+"\t"+"|"+"NAMA BARANG"+"\t"+"|"+"MERK"+"\t"+"|"+"HARGA"+"\t"+"|");
        System.out.println("========================================================================");
	NodeRelasi last = null; 
	while (data != null) {
            
        System.out.println("|"+ i++ +"."+"|" +data.getRelasi().akun+"\t"+"|"+data.getRelasi().usia+"\t"+"|"+data.getRelasi().gender+"\t"+"|"+data.getRelasi().nama+"\t"+"|"+data.getRelasi().harga+"\t"+"|"+data.getRelasi().merk+"\t"+"|" );
                t = data.getRelasi().harga;
                sum = sum + t;
                t++;
		last = data;
		data = data.getNext();
     	}            
            System.out.println("=====================================================================");
            System.out.println("TOTAL PENDAPATAN     :                                         " +sum );
            System.out.println("TOTAL BARANG TERJUAL :                                         " +(i - 1));
            
    }
}
