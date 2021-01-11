/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barang;

/**
 *
 * @author muchsin
 */

import java.util.*;
import relasi.LinkedListRelasi;
import relasi.Transaksi;

public class LinkedListBarang {
    private int size = 0;
    private NodeBarang head2 = null;
    private NodeBarang tail2 = null;
    public static String nama, merk;
    public static int harga;
    public int x ;
    private int sum = 0;
    
    LinkedListRelasi linkedListRelasi = new LinkedListRelasi();
 
     //kategori paling baru akan ditambah paling depan

     
    public void insertNodeBarang(Barang barang){
        NodeBarang new_NodeBarang = new NodeBarang(); 
        
                NodeBarang last = head2;
                new_NodeBarang.setBarang(barang);
		new_NodeBarang.setPrev (null); 

		if (head2 == null) { 
			new_NodeBarang.prev = null; 
			head2 = new_NodeBarang; 
			return; 
		} 

		while (last.next != null) 
			last = last.next; 

		last.next = new_NodeBarang; 

		new_NodeBarang.prev = last;            
    }
     
    
    public void addNodeBarang(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nama Barang : ");
        String new_nama = input.nextLine();
        System.out.print("Masukkan Merk barang : ");
        String new_merk = input.nextLine();
        System.out.print("Masukkan Harga Barang : ");
        int new_harga = input.nextInt();
        
	NodeBarang new_NodeBarang = new NodeBarang(); 
        Barang barang = new Barang(new_nama, new_merk, new_harga);
        
		NodeBarang last = head2;
                new_NodeBarang.setBarang(barang);
		new_NodeBarang.next = null; 

		if (head2 == null) { 
			new_NodeBarang.prev = null; 
			head2 = new_NodeBarang; 
			return; 
		} 

		while (last.next != null) 
			last = last.next; 

		last.next = new_NodeBarang; 

		new_NodeBarang.prev = last; 
    }
    
    public void insertBarang(){
        Barang barang1 = new Barang("laptop", "lenovo", 20000);
        Barang barang2 = new Barang("mouse", "jerry" , 15000 );
        Barang barang3 = new Barang("hardisk" , "samsung", 40000);
                
        insertNodeBarang(barang1);
        insertNodeBarang(barang2);
        insertNodeBarang(barang3);
    }
    
    
     public void printListBarang() {
         
         NodeBarang data = head2;
            int i = 1;
        System.out.println("=================================");
        System.out.println("|"+"NO"+"|"+"NAMA"+"\t"+"|"+"HARGA"+"\t"+"|"+"MEREK"+"\t"+"|");
        System.out.println("=================================");
	NodeBarang last = null; 
	while (data != null) {
            
            System.out.println("|"+ i++ +"."+"|" +data.getBarang().nama+"\t"+"|"+data.getBarang().harga+"\t"+"|"+data.getBarang().merk+"\t"+"|" );
		last = data;
		data = data.getNext(); 
	} 
            System.out.println("=================================");
    }
     
    
   public void searchNodeBarang() {
         
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Barang yang ingin dicari : ");
        String value = input.nextLine(); 
            
            int no = 1;
            boolean flag = false;   
            NodeBarang current = head2;  
            
            //Checks whether the list is empty  
            if(head2 == null) {  
                System.out.println("List is empty");  
                return;  
            }  
            
            while(current != null)
            {  
                //Compare value to be searched with each node in the list  
                if (value.equals(current.getBarang().nama)|| value.equals(current.getBarang().merk) || value.equals(current.getBarang().harga)) {  
                   flag = true;  
                    break;
                }     
              current = current.next; 
                no++;
            }
            
       if(flag){
           
        NodeBarang last = current; 
        System.out.println("======================================");
        System.out.println("|"+"NO"+"|"+"NAMA BARANG"+"\t"+"|"+"MERK"+"\t"+"|"+"HARGA"+"\t"+"\t"+"|");
        System.out.println("======================================");
         while(current != null){    
             while(value.equals(current.getBarang().nama)|| value.equals(current.getBarang().merk) || value.equals(current.getBarang().harga))
             {
                System.out.println("|"+no +"."+"|" + current.getBarang().nama+"\t"+"|"+current.getBarang().merk+"\t"+"|"+current.getBarang().harga+"\t"+"\t"+"|" );
                
                 
                nama = current.getBarang().nama;
                merk = current.getBarang().merk;
                harga = current.getBarang().harga; 
                x = current.getBarang().harga;
                break;
                
             }
           
             last = current;
             current = current.getNext();
          
             
         }   sum = sum + x;
             x++;
            System.out.println("=================================");
            System.out.println("");
            System.out.println("Nama Barang : "+nama);
            System.out.println("Usia Merk : "+merk);
            System.out.println("Gender Harga : "+harga);
            System.out.println("");
            System.out.println("=====================================================================");
            System.out.println("TOTAL PENDAPATAN     :                                         " +sum );
            System.out.println("TOTAL BARANG TERJUAL :                                      " +(no - 1));
       }
         else{  
                 System.out.println("Nama tidak ditemukan");}  
      
            linkedListRelasi.addNodeRelasi();       
    }

}
