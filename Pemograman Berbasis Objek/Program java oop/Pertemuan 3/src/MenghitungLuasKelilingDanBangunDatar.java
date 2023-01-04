import java.util.Scanner;

public class MenghitungLuasKelilingDanBangunDatar {
         
        int input = 0;
        int pnj,ler;
        
    
        public void choosePilihan()
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Pilih bangun datar yang akan dihitung : ");
            System.out.println("1.Persegi Panjang");
            System.out.println("2.Segitiga");
            System.out.println("3.Lingkaran");
            System.out.print("Pilihan Input : ");
            input=s.nextInt();
            System.out.println("\n");
        }
    
        public int getPilihan()
        {
            return input;
        }
    
        public void inputPilihan()
        {
            if(getPilihan()==1)
            {
                Scanner s = new Scanner(System.in);
                System.out.println("===== Menghitung Luas dan Keliling Persegi Panjang =====");
                System.out.println("Anda Memilih Persegi Panjang ");
                System.out.print("Masukkan Panjang = ");
                pnj=s.nextInt();
                System.out.print("Masukkan Lebar = ");
                ler=s.nextInt();
                int hasilLuas=pnj*ler;
                int hasilKeliling=2*(pnj+ler);
                System.out.println("Hasil Luas = " + hasilLuas);
                System.out.println("hasil keliling = " + hasilKeliling);
            }
    
            else if(getPilihan()==2)
            {
                int sisi,alas,tinggi;
                Scanner s = new Scanner(System.in);
                System.out.println("===== Menghitung Luas dan Keliling Segitiga =====");
                System.out.println("Anda Memilih Segitiga");
                System.out.print("Masukkan Sisi = ");
                sisi=s.nextInt();
                System.out.print("Masukkan Alas = ");
                alas=s.nextInt();
                System.out.print("Masukkan Tinggi = ");
                tinggi=s.nextInt();
                int hasilKeliling=3*sisi;
                double hasilLuas=0.5*alas*tinggi;
                System.out.println("Hasil Luas = " + hasilLuas);
                System.out.println("hasil keliling = " + hasilKeliling);
            }
    
            else if(getPilihan()==3)
            {
                double phi=3.14,r,d;
                Scanner s = new Scanner(System.in);
                System.out.println("==== Menghitung Luas dan Keliling lingkaran ====");
                System.out.println("Anda Memilih Lingkaran");
                System.out.print("Masukkan Jari-jari = ");
                r=s.nextDouble();
                d=r+r;
                double hasilKeliling=phi*d;
                double hasilLuas=phi*r*r;
                System.out.println("Hasil Luas = " + hasilLuas);
                System.out.println("hasil keliling = " + hasilKeliling);
            }
            else
		    {
			    System.out.println("Pilihan Tidak Tersedia!");
			    System.exit(0); 
		    }
        }
    
    
        public static void main(String[] args)
        {
            MenghitungLuasKelilingDanBangunDatar ts = new MenghitungLuasKelilingDanBangunDatar();
            ts.choosePilihan();
            ts.inputPilihan();
        }
}
