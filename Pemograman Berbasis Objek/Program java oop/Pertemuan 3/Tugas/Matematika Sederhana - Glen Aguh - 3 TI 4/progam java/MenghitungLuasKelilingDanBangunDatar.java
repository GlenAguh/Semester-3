import java.util.Scanner;

public class MenghitungLuasKelilingDanBangunDatar {
        double hasilkel;
        double hasillus;
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
                hasillus=pnj*ler;
                hasilkel=2*(pnj+ler);
                System.out.println("Hasil Luas = " + hasillus);
                System.out.println("hasil keliling = " + hasilkel);
            }
    
            else if(getPilihan()==2)
            {
                int sisi;
                double alas,tinggi;
                Scanner s = new Scanner(System.in);
                System.out.println("===== Menghitung Luas dan Keliling Segitiga =====");
                System.out.println("Anda Memilih Segitiga");
                System.out.print("Masukkan Sisi = ");
                sisi=s.nextInt();
                System.out.print("Masukkan Alas = ");
                alas=s.nextDouble();
                System.out.print("Masukkan Tinggi = ");
                tinggi=s.nextDouble();
                hasilkel=3*sisi;
                hasillus=0.5*alas*tinggi;
                System.out.println("Hasil Luas = " + hasillus);
                System.out.println("hasil keliling = " + hasilkel);
            }
    
            else if(getPilihan()==3)
            {
                double phi=3.14,r,d;
                Scanner s = new Scanner(System.in);
                System.out.println("Menghitung Luas dan Keliling Persegi Panjang");
                System.out.println("Anda Memilih Lingkaran");
                System.out.print("Masukkan Jari-jari = ");
                r=s.nextDouble();
                d=r+r;
                hasilkel=phi*d;
                hasillus=phi*r*r;
                System.out.println("Hasil Luas = " + hasillus);
                System.out.println("hasil keliling = " + hasilkel);
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
