package com.belajar;

import java.util.Scanner;

public class matriks {
	private static void sum(int[][] first, int[][] second) {
		int row = first.length;
		int column = first[0].length;
		int[][] sum = new int[row][column];

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				sum[r][c] = first[r][c] + second[r][c];
			}
		}

		System.out.print("Hasil Penjumlahan Matrix:\n");
		print2dArray(sum);
	}

	private static void kali(int[][] first, int[][] second) {
		int row = first.length;
		int column = first[0].length;
		int[][] kali = new int[row][column];

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				kali[r][c] = first[r][c] * second[r][c];
			}
		}

		System.out.print("Hasil perkalian matrix :\n");
		print2dArray(kali); 
	}

	private static void print2dArray(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				System.out.print(matrix[r][c] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		System.out.print("Masukkan baris matrix : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.print("Masukkan kolom matrix : ");
		int column = sc.nextInt();

		int[][] first = new int[row][column];
		int[][] second = new int[row][column];

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.print(String.format("Masukkan angka matrix pertama[%d][%d] integer :", r, c));
				first[r][c] = sc.nextInt();
			}
		}

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.print(String.format("Masukkan angka matrix kedua[%d][%d] integer : ", r, c));
				second[r][c] = sc.nextInt();
			}
		}

		sc.close();

		System.out.print("Matrix Pertama :\n");
		print2dArray(first);

		System.out.print("Matrix Kedua :\n");
		print2dArray(second);

		sum(first, second);
		kali(first, second);

	}
}