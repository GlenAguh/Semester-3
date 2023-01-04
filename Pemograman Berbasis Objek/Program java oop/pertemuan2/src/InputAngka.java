import java.util.*;
import java.io.*;
public class InputAngka {
   
	int num = 0;
	int pilih = 0;

    // Output bagian awal
	public void printNama()
	{
		System.out.println("\n");
		System.out.println("Nama : Glenn");
		System.out.println("Kelas : 3 TI 4");
		System.out.println("Prodi : D4 Teknik Informatika");
		System.out.println("\n");
	}

    // Bagian pilihan input
	public void pilihInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Pilihan Jenis Input");
		System.out.println("1. Scanner");
		System.out.println("2. BufferedReader");
		System.out.println("\n");
		System.out.print("Pilih Jenis Inputan Anda : ");
		pilih = s.nextInt();
		System.out.println("\n");
	}

    // Setelah menginput pilihan di metode pilihInput, maka pilihan tersebut akan dikembalikan disini
	public int getPilihan()
	{
		return pilih;
	}

    // Bagian inputan angka
	public void setNumber()
	{
        // Jika memilih angka 1 di bagian Pilih Metode Input, maka akan muncul metode pilihan Scanner
		if (getPilihan() == 1) {
			Scanner s = new Scanner(System.in);
			System.out.print("Anda memilih jenis inputan Scanner\n");
			System.out.print("Your number is : ");
			num = s.nextInt();

        // Jika memilih angka 2 di bagian Pilih Metode Input, maka akan muncul metode pilihan BufferedReader
		} else if (getPilihan() == 2) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.print("Anda memilih jenis inputan BufferedReader\n");
				System.out.print("Your number is : ");
				num = Integer.parseInt(br.readLine());
			}
			catch(Exception e){}

        // Jika memilih selain 1 dan 2 maka akan muncul pesan eror dan program tidak akan melanjutkan lagi output berikutnya
		} else {
				System.out.println("Pilihan Tidak Tersedia!");
				System.exit(0); 
		}
	}

    // Setelah menginput pilihan di metode setNumber, maka angka tersebut akan dikembalikan disini
	public int getNumber()
	{
		return num;
	}

    // Pengkondisian if else bilangan ganjil genap, Bagian ini adalah tugas dari metode getNumber
	public void isGenap(int bilangan)
	{
		if(bilangan % 2 == 0)
			System.out.println(bilangan + " adalah bilangan Genap\n");
		else
			System.out.println(bilangan + " adalah bilangan Ganjil\n");
	}	

    // Metode yang dipanggil akan dieksekusi disini
	public static void main(String[] args)
	{
		InputAngka ts = new InputAngka();

        // Output bagian awal yang dipanggil
		ts.printNama();
        // metode jenis input pilihan yang dipanggil
		ts.pilihInput();
        // metode input angka yang dipanggil
		ts.setNumber();
        // Ketika angka yang diinput dari metode setNumber dikembalikan ke metode getNumber, angka tersebut akan dipanggil ke metode isGenap lalu pengkondisian if else langsung dijalankan.
		ts.isGenap(ts.getNumber());
    }
}
