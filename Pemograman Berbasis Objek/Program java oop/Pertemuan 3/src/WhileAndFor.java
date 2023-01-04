import java.util.*;

public class WhileAndFor {

    int pilih = 0;
    int nilaiAwal = 0;
    int nilaiAkhir = 0;

    public void pilihInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Pilihan Jenis Looping");
        System.out.println("1. WHILE");
        System.out.println("2. FOR");
        System.out.println("\n");
        System.out.print("Pilihan : ");
        pilih = s.nextInt();
    }

    public int getPilih() {
        return pilih;
    }

    public void nilaiAwalInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Nilai Awal : ");
        nilaiAwal = s.nextInt();
    }

    public int getNilaiAwal() {
        return nilaiAwal;
    }

    public void nilaiAkhirInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Nilai Akhir : ");
        nilaiAkhir = s.nextInt();
    }

    public int getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNumber() {
        if (getPilih() == 1) {

            System.out.println("Looping with WHILE");
            int i = nilaiAwal;
            int j = nilaiAkhir;
            while (i <= j) {
                System.out.println(i);
                i++;
            }
        } else if (getPilih() == 2) {
            System.out.println("Looping with FOR");
            int i = nilaiAwal;
            int j = nilaiAkhir;
            for (int ii = i; ii <= j; ii++) {
                System.out.println(ii + " ");
            }
        }
    }

    public static void main(String[] args) {
        WhileAndFor ts = new WhileAndFor();
        ts.pilihInput();
        ts.nilaiAwalInput();
        ts.nilaiAkhirInput();
        ts.setNumber();
    }
}

// Buatlahh aplikasi sederhana yang akan menampilkan bentuk
// Seperti ini
// ******
// ******
// ******
// ******
// dimna icon dan ukuran sesui dengan ukuran inputan user.
// Gunakan while dan for
