import java.io.*;
public class InputFromKeyboard {
    //BufferedReader adalah class yang digunakan untuk input data dari keyboard

    public static void main(String[]a)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
            System.out.println("##  Program Java Biodata  ##");
            System.out.println("###  ===================  ###");
            System.out.println();
            System.out.println("Enter your Faculty");
			String faculty = br.readLine();
			System.out.println("Enter your Name");
			String name = br.readLine();
            System.out.println ("Enter Your Nim");
            int nim = Integer.parseInt(br.readLine());
            System.out.print("Enter your age ");
			int age = Integer.parseInt(br.readLine());
            System.out.println("Enter your Major");
			String jur = br.readLine();
            System.out.println("Enter your Prodi");
			String prodi = br.readLine();
            System.out.println ("");


            System.out.println("###  ======================  ###");


            System.out.println ("");
            System.out.println("Your Faculty                : " + faculty);
			System.out.println("Your Name                   : " + name);	
            System.out.println("Your Nim                    : " + nim);
			System.out.println("Your age                    : " + age);	
            System.out.println("Your Major                  : " + jur);	
            System.out.println("Your Study Program          : " + prodi);
		}
		catch(Exception e)
		{

		}

	}
}
