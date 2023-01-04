package com.belajar;

import java.util.Scanner;

public class Tugas {
    // Deklarasi variabel
    int bilangan;
    double [] bil;
    double avg,total,terbesar,terkecil;
    Scanner inputUser = new Scanner(System.in);

    // Constructor Method
    public Tugas () {
        System.out.print("Masukkan bilangan total = ");
        bilangan = inputUser.nextInt();
    }

    public void inputBilangan() {
        bil = new double [bilangan];
        System.out.print("\n");
        for (int i = 0; i < bil.length;i++){
            System.out.print("Masukkan " + (i + 1) + " :");
            bil [i] = inputUser.nextInt();
        }
        for(int i=0;i<bil.length;i++){
			for(int j = i+1; j<bil.length;j++){
				if (bil[i]==bil[j]){
				System.out.println("Bilangan Tidak Boleh Sama");
				System.out.print("Masukkan Bilangan Baru : ");
				bil[j]=inputUser.nextDouble();
				}
			}
		
		}
		
	}

    // Menaampilkan bilangan setelah di input
    public void displayBilangan() {
        System.out.print("\n");
        for (int i = 0; i< bil.length;i++){
            System.out.println("Bilangan " + (i + 1) + " : " + bil[i]);
        }

    }

    // Menghitung rata-rata bilangan
    public void rataBilangan() {
        for (int i = 0 ; i < bil.length; i++){
            total = total + bil[i];
        }
        avg = total / bil.length;
    }


    public void nilaiTerbesarTerkecil() {
        for(int i= 0 ;i < bil.length;i++){ 
            if( bil[i] > terbesar){
                terbesar = bil[i] ;  
           }
            else if (bil[i] < terkecil){
                terkecil = bil[i]; 
           }
        }
    }

    
    // Mengembalikan nilai pada variabel avg
    public double getRata(){
        return avg;
    }

    // Mengembalikkan nilai pada variabel total
    public double getTotal(){
        return total;
    }

    public double getTerbesar (){
        return terbesar;
    } 
    public double getTerkecil (){
        return terkecil;
        
        
    } 

    // Hasil output jumlah bilangan rata-rata,jumlah keseluruhan bilangan,nilai terbesar dan terkecil
    public void hasilBilangan(double jumlah, double rata,double terbesar,double terkecil) {
        System.out.print("\n");
        System.out.println("Jumlah keseluruhan bilangan = " + jumlah);
        System.out.println("Rata-rata bilangan = " + rata);
        System.out.println("Nilai terbesar = " + terbesar);
        System.out.println("Nilai terkecil = " + terkecil);
    }




    public static void main(String[] args) {
       Tugas hb = new Tugas();
       hb.inputBilangan();
       hb.displayBilangan();
		hb.rataBilangan();
        hb.nilaiTerbesarTerkecil();
		hb.hasilBilangan(hb.getTotal(),hb.getRata(),hb.getTerbesar(),hb.getTerkecil());
       
    }
}
