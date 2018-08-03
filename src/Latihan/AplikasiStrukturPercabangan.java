/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Tarishaulia
 */
public class AplikasiStrukturPercabangan {
    public static void main(String[]args){
        String identitas = "RIZQITA TARISH AULIA / XRPL5 / 37";
        System.out.println("Identitas : "+ identitas);
        
        
    Scanner input = new Scanner(System.in);
    String ulangi ="y";
 
    int pil;
    
    System.out.println("---SELAMAT DATANG---");
    System.out.println("TENTUKAN KELASMU BERDASARKAN NILAIMU");
    System.out.println("MASUKKAN PILIHAN BERDASARKAN NILAIMU ") ;
    System.out.println("PILIHAN 1 : 51 - 60");
    System.out.println("PILIHAN 2 : 61 - 70");
    System.out.println("PILIHAN 3 : 71 - 80");
    System.out.println("PILIHAN 4 : 81 - 90");
    System.out.println("Pilihan 5 : 91 - 100");
    System.out.print("PILIHAN : ");
    pil=input.nextInt();
    switch(pil){
        
    case 1  :{
          
    System.out.print("Anda masuk ke kelas F");
    break;
    
    }
    
    case 2 :{
    System.out.print("Anda masuk ke kelas E");
    break;
    
    }
    
    case 3 :{
    System.out.print("Anda masuk ke kelas D");
    break;
    
    }
    
    case 4 :{
    System.out.print("Anda masuk ke kelas C ");
    break;
    
    }
    
    case 5 :{
    System.out.println("Anda masuk ke kelas B ");
    break;
    
    }
    
    case 6 :{
    System.out.println("Anda masuk ke kelas A ");
    break;
    
    }
    
    }
    }
}
