/*
    @Author 
        GlennAguhh;

 */

import java.util.Scanner;
import java.io.*;

public class TessSumatif {

    String simbol;
    int ukuran, a, b;

    public void inputIcon() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan Simbol : ");
            simbol = br.readLine();
            System.out.print("\n");
        } catch (Exception e) {
        }
    }

    public String getIcon() {
        return simbol;
    }

    public void inputTinggi() {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Icon Looping");
        System.out.print("Masukkan Ukuran = ");
        ukuran = inputUser.nextInt();
    }

    public int getTinggi() {
        return ukuran;
    }

    public void pengulanganFor(int tinggi, String icons) {
        for (a = 1; b <= tinggi; b++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(icons);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TessSumatif s = new TessSumatif();
        s.inputIcon();
        s.inputTinggi();
        s.pengulanganFor(s.getTinggi(), s.getIcon());
    }
}