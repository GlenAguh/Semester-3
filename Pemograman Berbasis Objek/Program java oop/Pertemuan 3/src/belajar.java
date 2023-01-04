import java.io.BufferedReader;
import java.io.InputStreamReader;

public class belajar {
    String nama, nim, kelas;

    public void Biodata() {
        BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Masukkan Biodata Anda ");
            System.out.print("Masukkan Nama : ");
            nama = inputUser.readLine();
            System.out.print("Masukkan Nim : ");
            nim = inputUser.readLine();
            System.out.print("Masukkan kelas : ");
            kelas = inputUser.readLine();
            System.out.print("\n");

        } catch (Exception e){

        }
    }

    public void keluaran() {
        System.out.println("=====BIODATA=====");
        System.out.println("Nama    : " + nama);
        System.out.println("Nim     : " + nim);
        System.out.println("Kelas   : " + kelas);
        System.out.println("Bukan Aku yang Hebat");
        System.out.println("Tapi Tuhan Lah yang mempermudah");
    }



    public static void main(String[] args) {
        System.out.println("Glenn");
        belajar s = new belajar();
        s.Biodata();
        s.keluaran();
    }
}