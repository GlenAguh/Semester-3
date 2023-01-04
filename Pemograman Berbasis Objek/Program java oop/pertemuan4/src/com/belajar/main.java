package com.belajar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;


public class main
{
	String[]mahasiswa;
	Scanner s = new Scanner (System.in);
	
	public main()
	{
        System.out.println("===== Mahasiswa Polimdo =====");
		System.out.print("Masukkan jumlah mahasiswa : ");
		
		mahasiswa = new String[s.nextInt()];
	}

	public void displaynumberOfStudents()
	{
		System.out.println("mempunyai  " + mahasiswa.length + " mahasiswa");
	}

	public void inputStudents()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<mahasiswa.length;i++)
		{
			try
			{
				System.out.print("Nama Mahasiswa" + (i+1) + " : ");
				mahasiswa[i] = br.readLine();
			}
			catch (Exception e) {}
		}
	}
        
	public void displayStudents()
	{
        System.out.printf("\n");
        System.out.println("Jumlah Mahasiswa " + mahasiswa.length);
		for (int i = 0;i<mahasiswa.length;i++)
		{
			System.out.println("Mahasiswa " + (i+1) + " : " + mahasiswa[i]);
		}
	}

	public static void main(String[] args) {
		main ta = new main();
		ta.displaynumberOfStudents();
		ta.inputStudents();
		ta.displayStudents();
	}
}

// buatlah aplikasi sederhana yg menghitung jumlah semua bilangan yang di masukkan pengguna beserta nilai rata"nya.gunakan arrayy
