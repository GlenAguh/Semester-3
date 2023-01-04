package com.uts;

import java.util.Scanner;
import java.io.*;
public class Uts
{
	String[]mahasiswa;
	float []nilai;
	String [] grade;
	Scanner s = new Scanner (System.in);

	// constructor
	public Uts()
	{
		System.out.print("Masukkan jumlah Mahasiswa : ");
		mahasiswa = new String[s.nextInt()];
	}


	// INput mahasiswa
	public void inputMahasiswa()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<mahasiswa.length;i++)
		{
			try
			{
				System.out.print("Masukkan Nama Mahasiswa "+ (i+1) +" : ");
				mahasiswa[i] = br.readLine();
			}
			catch(Exception e){}
		}
		System.out.println("");
	}

	

	public void displayMahasiswa()
	{
		System.out.println("PEMASUKAN NILAI MATA KULIAH : Pemrograman Objek " );
		nilai = new float [mahasiswa.length];
		for(int i=0;i<mahasiswa.length;i++)
		{
				System.out.print("Masukkan Nilai " + mahasiswa[i] +": ");
				nilai [i] = s.nextInt();
		}
		System.out.println("");
	}

	// Proses grade nilai
	public void gradeNilaiMhs() {
		grade = new String[mahasiswa.length];
		for (int i = 0;i<mahasiswa.length;i++){
			if (nilai[i] > 89 && nilai[i]<= 100){
				grade[i] = "A";
			} else if (nilai[i] > 75 && nilai[i]<= 89){
				grade[i] = "B";
			}else if (nilai[i] > 50 && nilai[i]<= 75){
				grade [i] = "C";
			} else if (nilai[i] > 39 && nilai[i]<= 50){
				grade[i] = "D";
			}else {
				grade [i] = "E";
			}
		}
	}


	public void rekapNilai()
	{
		System.out.println("MATA KULIAH : Pemrograman Objek");
		System.out.println("DOSEN : Maksy Sendiang");
		System.out.println("------------------------------------");
		System.out.println("No \t Nama Mahasiswa \t \t Nilai Akhir \t Grade");
        for(int i = 0 ; i < mahasiswa.length ;i++){
			System.out.println((i+1) + " \t " + mahasiswa[i] + " \t\t\t\t " + nilai[i] + " \t\t " + grade[i]);
        }
        
	}

	public static void main(String[] args)
	{
		Uts nm = new Uts();
		nm.inputMahasiswa();
		nm.displayMahasiswa();
		nm.gradeNilaiMhs();
		nm.rekapNilai();
	}
}
