/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author muchsin
 */

import java.util.*;

public class LinkedListUser {
    
    private int size = 0;
    private NodeUser head1 = null;
    private NodeUser tail1 = null;
    
    public static String a, g, u ;
//================ 
    public void insertNodeUser(User user){        
        NodeUser new_NodeUser = new NodeUser(); 

		NodeUser last = head1;
                new_NodeUser.setUser(user);
		new_NodeUser.setPrev (null); 

		if (head1 == null) { 
			new_NodeUser.prev = null; 
			head1 = new_NodeUser; 
			return; 
		} 

		while (last.next != null) 
			last = last.next; 

		last.next = new_NodeUser; 

		new_NodeUser.prev = last;
                
    }
     
    
    public void addNodeUser(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nama User : ");
        String new_akun = input.nextLine();
        System.out.print("Masukkan nama Gender : ");
        String new_gender = input.nextLine();
        System.out.print("Masukkan nama Usia : ");
        String new_usia = input.nextLine();
        
	NodeUser new_NodeUser = new NodeUser(); 
        User user = new User(new_akun, new_gender,  new_usia);
        
		NodeUser last = head1;
                new_NodeUser.setUser(user);
		new_NodeUser.next = null; 

		if (head1 == null) { 
			new_NodeUser.prev = null; 
			head1 = new_NodeUser; 
			return; 
		} 

		while (last.next != null) 
			last = last.next; 

		last.next = new_NodeUser; 

		new_NodeUser.prev = last; 
	}
    
    public void insertUser(){
        
        User user1 = new User("kucing", "male", "21");
        User user2 = new User("ayam","male", "22");
        User user3 = new User("sapi", "female", "23");
        User user4 = new User("bebek", "female", "24");
        insertNodeUser(user1);
        insertNodeUser(user2);
        insertNodeUser(user3);
        insertNodeUser(user4);      
    }
       
    public void printListUser() {         
         
         NodeUser data = head1;
            int i = 1;
        System.out.println("======================================");
        System.out.println("|"+"NO"+"|"+"NAMA"+"\t"+"|"+"USIA"+"\t"+"|"+"GENDER"+"\t"+"\t"+"|");
        System.out.println("======================================");
	NodeUser last = null; 
	while (data != null) {
            
            System.out.println("|"+ i++ +"."+"|" +data.getUser().akun+"\t"+"|"+data.getUser().usia+"\t"+"|"+data.getUser().gender+"\t"+"\t"+"|" );
		last = data;
		data = data.getNext(); 
	} 
            System.out.println("=================================");
    }
     
     public void searchNodeUser() {
         
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan User yang ingin dicari : ");
        String value = input.nextLine(); 
            
            int no = 1;
            boolean flag = false;   
            NodeUser current = head1;  

            //Checks whether the list is empty  
            if(head1 == null) {  
                System.out.println("List is empty");  
                return;  
            }  
            
            while(current != null)
            {  
                //Compare value to be searched with each node in the list  
                if (value.equals(current.getUser().akun)|| value.equals(current.getUser().usia) || value.equals(current.getUser().gender)) {  
                   flag = true;  
                    break;
                }  
                current = current.next; 
                no++;
              
            }  
    
       if(flag){
           
        NodeUser last = null; 
        System.out.println("======================================");
        System.out.println("|"+"NO"+"|"+"NAMA"+"\t"+"|"+"USIA"+"\t"+"|"+"GENDER"+"\t"+"\t"+"|");
        System.out.println("======================================");
         while(current != null){       
             while(value.equals(current.getUser().akun)|| value.equals(current.getUser().usia) || value.equals(current.getUser().gender))
             {
                System.out.println("|"+no +"."+"|" + current.getUser().akun+"\t"+"|"+current.getUser().usia+"\t"+"|"+current.getUser().gender+"\t"+"\t"+"|" );
                
                
                a = current.getUser().akun;
                u = current.getUser().usia;
                g = current.getUser().gender;
                
              last = current;
              break;
             }
             no++;
             
             current = current.getNext();
          }
            System.out.println("=================================");
            System.out.println("");
            System.out.println("Nama Pembeli : "+a);
            System.out.println("Usia Pembeli : "+u);
            System.out.println("Gender Pembeli : "+g);
            System.out.println("");
            
       }
         else{  
                 System.out.println("Nama tidak ditemukan");}  
             
    }


}
