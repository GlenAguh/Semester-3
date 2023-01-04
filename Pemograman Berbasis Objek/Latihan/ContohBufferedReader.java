package com.bahasajava.io;
  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
//Membaca input dari user melalui konsol dengan menggunakan BufferedReader
public class ContohBufferedReader{
  
 public static void main(String[] args) {
   
  //Membuat objek BufferedReader
  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
   
  //Membuat user prompt untuk menginput nama
  System.out.print("Masukkan nama anda: ");
   
  //Membuat objek StringBuffer
  StringBuffer stringBuffer = new StringBuffer("Selamat datang ");
   
  //Membaca input dari user
  try {
    
   //Menggabungkan string Selamat datang dengan baris text yang berasal dari 
   //input oleh user
   stringBuffer.append(bufferedReader.readLine());
    
   //menutup objek BufferedReader
   bufferedReader.close();
    
   //Menampilkan string setelah menerima input dari user
   System.out.println(stringBuffer);
    
   //Menangkap exception yang mungkin terlempar ketika user memasukkan input
  } catch (IOException e) {
   System.out.println("Error terjadi ketika mencoba mendapatkan input dari user: "+ e.getMessage());
   e.printStackTrace();
  }
   
 }
}