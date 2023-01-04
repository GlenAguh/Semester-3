package com.belajar;
import java.util.Scanner;

public class mahasiswaArray {
    public static void main(String[] args) {
        // membuat array buah-buahan
        String[] nama = new String[3];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < nama.length; i++ ){
            System.out.print("Mahasiswa ke-" + i + ": ");
            nama[i] = scan.nextLine();
        

            for( i=0;i<nama.length;i++){
                for(int j = i+1; j<nama.length;j++){
                    if (nama[i]==nama[j]){
                    System.out.println("Bilangan Tidak Boleh Sama");
                    System.out.print("Masukkan Bilangan Baru : ");
                    nama[j]=scan.next();
                    }
                }
            
            }
        }
    
        
        //     for(int i =0;i<nama.length;i++){
        //         for(int j = i+1; j<nama.length;j++){
        //             if (nama[i]==nama[j]){
        //             System.out.println("Bilangan Tidak Boleh Sama");
        //             System.out.print("Masukkan Bilangan Baru : ");
        //             nama [j] = scan.nextLine();
        //             }
        //         }
        // }
    

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String b : nama ){
            System.out.print("["+b+"]");
        }

    }
}
