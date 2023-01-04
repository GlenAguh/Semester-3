import java.util.Scanner;
import java.io.*;
public class PiramidSimbol
{
    int ukuran;
    String simbol;

    //input simbol
    public void Simbol()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println();
            System.out.print("Masukkan Simbol : ");
            simbol = br.readLine();
        }
        catch(Exception e){}
    }
    public String getSimbol()
    {
        return simbol;
    }


    //input ukuran
    public void sizeInput()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Ukuran : ");
        ukuran = s.nextInt();
        System.out.println();
    }
    public int getSize()
    {
        return ukuran;
    }
    
    //pengulangan FOR
    public void simbolFor()
    {
        System.out.println("Pengulangan For");
        for (int i=1;i<=ukuran;i++)
        {
            for(int j=1;j<=ukuran;j++)
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
        while (i<ukuran) {
            int j=0;
            while (j<ukuran) {
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
        PiramidSimbol ps = new PiramidSimbol();
        ps.Simbol();
        ps.sizeInput();
        ps.getSize();
        ps.getSimbol();
        ps.simbolFor();
        ps.simbolWhile();
    }
}