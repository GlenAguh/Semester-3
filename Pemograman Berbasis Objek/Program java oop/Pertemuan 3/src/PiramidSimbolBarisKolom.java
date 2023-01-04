import java.util.Scanner;
import java.io.*;
public class PiramidSimbolBarisKolom
{
    int baris,kolom;
    String simbol;

//input ukuran
    public void sizeInput()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Baris: ");
        baris = s.nextInt();
        System.out.print("Masukkan Kolom: ");
        kolom = s.nextInt();
    }
    public int getBaris()
    {
        return baris;
    }
    public int getKolom()
    {
        return kolom;
    }

//input simbol
    public void Simbol()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("Masukkan Simbol : ");
            simbol = br.readLine();
            System.out.println();
        }
        catch(Exception e){}
    }
    public String getSimbol()
    {
        return simbol;
    }

//pengulangan FOR
    public void simbolFor()
    {
        System.out.println("Pengulangan For");
        for (int i=1;i<=baris;i++)
        {
            for(int j=1;j<=kolom;j++)
            {
                System.out.print(simbol);
            }
            System.out.println();
        }
        System.out.println();
    }

//pengulangan While
    public void simbolWhile() 
    {
        System.out.println("Pengulangan While");
        int i=0;
        while (i<baris) {
            int j=0;
            while (j<kolom) {
                System.out.print(simbol);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.print("\n");
    }


    public static void main(String[] args)
    {
        PiramidSimbolBarisKolom ps = new PiramidSimbolBarisKolom();
        ps.sizeInput();
        ps.getBaris();
        ps.getKolom();
        ps.Simbol();
        ps.getSimbol();
        ps.simbolFor();
        ps.simbolWhile();
    }
}