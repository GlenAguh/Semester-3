/*
	Program ini adalah bujursangkar 3x3
	- Member array berada di antara 1-9
	- Angka tidak boleh double, jika double maka anda harus input ulang
	- Jika salah menginput dalam 3 kali, maka program keluar sendiri.
*/
package com.belajar;
import java.util.Scanner;

public class ArrayBujurSangkar {

	Scanner s = new Scanner (System.in);
	int angka[][] = new int[3][3];
	int sumRow, sumCol, jumlah, invalid = 0, kesempatan = 2, inv = 1;
	Boolean valid = false;

	public ArrayBujurSangkar() {
		System.out.println("\nProgram Bujursangkar 3x3");
		System.out.print("Masukkan Nama Anda : ");
		String nama = s.nextLine();
		System.out.println("\nNama Anda : " + nama);
	}

	public void inputBujurSangkar() {
		for (int i = 0; i<angka.length; i++) {
			for (int j = 0; j<angka.length; j++) {
				do {
					if (invalid == 3) {
						System.out.println("Anda sudah melakukan kesalahan dalam 3 kali!");
						System.out.println("Keluar dari program...");
						System.exit(0);
					}

					System.out.print("Masukkan Angka " + (i+1) + "," + (j+1) + " = ");
					int a = s.nextInt();

					if(angkaSepuluh(a)) {
					System.out.println("Angka tidak boleh 10 bahkan lebih!");
					pesanInvalid();
					invalid++;
					j--;
				} else {
					if(kurangDariSatu(a)) {
						if(angkaDouble(a)) {
							if(kurangDariSepuluh(a)) {
								valid = true;
								angka[i][j] = a;
							} else {
								System.out.println("Angka valid hanya 1-9!");
								pesanInvalid();
								invalid++;
								j--;
							}
						}
						else {
							System.out.println("Angka ini sudah ada!");
							pesanInvalid();
							invalid++;
							j--;
						}
					}
					else {
						System.out.println("Maaf, angka tidak boleh kurang dari 1!");
						pesanInvalid();
						invalid++;
						j--;
					}
				}
				} while (!valid);
			}
		}
		System.out.println();
	}

	public void pesanInvalid() {
		System.out.println("Anda telah melakukan kesalahan " + (inv++) + " kali! " + "Kesempatan anda sisa " + (kesempatan--) + "kali! ");
	}

	public void printBujurSangkar() {
		for (int i = 0; i<angka.length; i++) {
			for (int j = 0; j<angka[0].length; j++) {
				System.out.print(angka[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void sumBujurSangkar() {
		// Menghitung jumlah angka yang berada di setiap baris
		for (int i = 0; i < angka.length; i++) {
			sumRow = 0;
			for (int j = 0; j < angka.length; j++) {
				sumRow = sumRow + angka[i][j];
			}
			System.out.println("Jumlah dari baris ke-" + (i+1) + " = " + sumRow);
		}

		// Menghitung keseluruhan angka di dalam bujursangkar 3x3
		for (int i = 0; i<angka.length; i++) {
			for (int j = 0; j<angka[0].length; j++) {
				jumlah += angka[i][j];
			}
		}
		System.out.println("\nJumlah keseluruhan = " + jumlah);
	}

	public boolean angkaDouble(int x) {
		for(int i = 0; i<angka.length; i++)
		{
			for(int j = 0; j<angka.length; j++)
			{
				if(angka[i][j] == x){
					return false;
				}
			}
		}
		return true;
	}

	public boolean kurangDariSepuluh(int x) {
		boolean b = true;
		if (x >= 10)
			b = false;
		return b;
	}

	public boolean kurangDariSatu(int x) {
		boolean b = true;
		if(x <= 0)
			b = false;
		return b;
	}

	public boolean angkaSepuluh(int x) {
		boolean b = false;
		if (x == 0) {
			b = false;
		} else {
			if (x % 10 == 0)
				b = true;
		}
		return b;
	}

	public static void main(String[] args) {
		ArrayBujurSangkar bs = new ArrayBujurSangkar();
		bs.inputBujurSangkar();
		bs.printBujurSangkar();
		bs.sumBujurSangkar();
	}
}