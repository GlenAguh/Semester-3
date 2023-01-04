package com.belajar;

import java.util.Arrays;
import java.util.Scanner;

// import java.util.Arrays;

public class Array2Dimensi {
    Scanner inputUser = new Scanner(System.in);

    int [][] angka;
    public Array2Dimensi(int size){

        angka = new int [size] [size];

    }

    public void inputMember() {
        for(int i = 0;i<angka.length;i++){
            for (int j = 0;j<angka.length;j++){
                System.out.print("Enter member " + i + "," + j + ":" );
                angka[i][j] = inputUser.nextInt();
            }
        }
       
    }
    /*
     1.Dapat menginput array member untuk matriks bujursangkar 

    2.Dapat mendisplay array dalam bentuk matriks

    3.Member yang bisa di input 1-9. Tak boleh angka double

    4. Dapat menghitung jumlah member pada setiap baris dan kolom
     */
    

    public static void main(String[] args) {
        int[][] bilangan = { { 1, 2, 3, 4 },
        { 3, 4, 0 },
        { 1, 2, 3, 4 },
        { 3, 4, 5 }, 
        { 3, 4, 5, 4 }, 
        { 6, 7, 8 },
        { 10, 11, 4 } };

        System.out.println(Arrays.deepToString(bilangan));

        
        // System.out.println(Arrays.toString(bilangan));
        for (int i = 0; i < bilangan.length; i++) {
            for (int j = 0; j < bilangan[i].length; j++) {
                System.out.print("[" + bilangan[i][j] + "]");
            }
            System.out.println();
        }


        Array2Dimensi ad = new Array2Dimensi(3);
        ad.inputMember();
        
        // Buat program sedehana yg menyimpan nama mahasiswa.
        // nama tidak boleh sama 

        int nama[];
        
        

    }
}
