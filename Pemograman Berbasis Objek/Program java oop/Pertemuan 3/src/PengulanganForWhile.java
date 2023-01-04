// Import class Scanner
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.event.SwingPropertyChangeSupport;

// Import class BufferedReader
import java.io.*;

public class PengulanganForWhile {

	// Deklarasi Variabel
	String ikon;
	int kolom, baris, tinggi;

	// Method Ikon
	public void ikon() {
		// Karena ikon yang diinput akan menggunakan String, maka kita memakai class BufferedReader
		BufferedReader br = new BufferedReader (new InputStreamReader ( System.in ));
		// Menginput ikon
		try {
			System.out.print("Masukan Ikon : ");
			ikon = br.readLine();
			System.out.println("Ikon yang diinput adalah : " + ikon);
			System.out.print("\n");
		}
		catch(Exception e) {}
	}

	// Menginput baris dan kolom
	public void barisKolom() {
		Scanner s = new Scanner(System.in);
		System.out.println("Icon Looping");
		System.out.print("Masukan Baris = ");
		baris = s.nextInt();
		System.out.print("Masukan Kolom = ");
		kolom = s.nextInt();
		System.out.print("Masukkan tinggi segitiga = ");
		tinggi = s.nextInt();
		System.out.print("\n");
	}

	// Pengulangan For
	public void ikonFor(int row,int column, String icons) {
		System.out.println("Pengulangan For \n");
		// Pengulangan untuk baris
		for (int i = 0; i < row; i++ ) {
			// Pengulangan untuk kolom
			for (int j = 0; j < column; j++ ) {
				System.out.print(icons);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}


	// Piramida For
	public void ikonForPiramida(int tinggi, String icons) {
		System.out.println("Pengulangan For Piramida\n");
		for(int i=1; i<=tinggi; i++) {
			// Menghitung jumlah tinggi piramida
  
			for(int j=i; j<=tinggi ; j++) {
				// Menghitung jumlah spasi per baris
			  System.out.print(" ");
			}
			for(int k=0; k<=(i*2)-2; k++) {
			  System.out.print(icons);
			}
			System.out.print("\n");
		  }
		  System.out.print("\n");
	}
		



	// Pengulangan While
	public void ikonWhile(int row, int column, String icons) {
		System.out.println("Pengulangan While\n");
		int i = 0;
		// Pengulangan untuk baris
		while (i < row) {
			int j = 0;
			// Pengulangan untuk kolom
			while (j < column) {
				System.out.print(icons);
				j++;
			}
			System.out.print("\n");
			i++;
		}
		System.out.print("\n");
	}


	// Piramida For
	public void ikonwhilePiramida(int tinggi, String icons) {
		System.out.println("Pengulangan While Piramida\n");
		int i=1;
            while (i<=tinggi){
            int j=tinggi-1;
                while (j>=i){
                    System.out.print("  ");
                    j--;
                }
                
                int k=1;
                while (k<=i){
                    System.out.print("* ");
                    k++;
                }
                
                int l=1;
                while (l<=i-1){
                    System.out.print("* ");
                    l++;
                }
                
            i++;
            System.out.println();
            }
	}	
		
		
		
		
		
		
		
		
		
		
		// Menghitung jumlah tinggi piramida
  
			
				// Menghitung jumlah spasi per baris
			  
			
			




	// Mengembalikan ikon yang diinput dari method Ikon
	public String ambilIkon() {
		return ikon;
	}

	// Mengembalikan nilai baris yang diinput ke method
	public int ambilBaris() {
		return baris;
	}

	// Mengembalikan nilai kolom yang diinput ke method
	public int ambilKolom() {
		return kolom;
	}

	// Mengembalikan nilai Tinggi yang diinput ke method
	public int ambilTinggi() {
		return tinggi;
	}

	// Semua method akan dipanggil di sini
	public static void main(String[] args) {
		PengulanganForWhile ik = new PengulanganForWhile();
		// Method menginput ikon
		ik.ikon();
		// Method Menginput baris dan kolom
		ik.barisKolom();
		// Method Pengulangan For berisi 3 method yang berada di dalam parameter
		ik.ikonFor(ik.ambilBaris(),ik.ambilKolom(),ik.ambilIkon());
		// Method Pengulangan For berisi 2 method yang berada di dalam parameter
		ik.ikonForPiramida(ik.ambilTinggi(),ik.ambilIkon());

		ik.ikonwhilePiramida(ik.ambilTinggi(), ik.ambilIkon());

		// Method Pengulangan While berisi 3 method yang berada di dalam parameter
		ik.ikonWhile(ik.ambilBaris(),ik.ambilKolom(),ik.ambilIkon());
		
	}
}