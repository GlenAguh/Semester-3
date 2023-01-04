import java.util.*;
public class TestScanner {
    int num = 0;
	public void printNama()
	{
		System.out.println("POLIMDO");
	}

	public void printNama(String nama)
	{
		System.out.println(nama);
	}
	public void setNumber()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Your number is ");
		num = s.nextInt();
	}

	public int getNumber()
	{
		return num;
	}

	public void isGenap(int bilangan)
	{
		if(bilangan % 2 == 0)
			System.out.println("Genap");
		else
			System.out.println("Ganjil");
	}

	/*public void displayNumber()
	{
		System.out.println(num);
	}*/

	public static void main(String[] args) 
	{
		TestScanner ts = new TestScanner();
		ts.printNama();  // buat objek
		ts.printNama("Manado"); 
		// ts.setNumber();
		// ts.isGenap(ts.getNumber());
		//Scanner s = new Scanner(System.in);
		/*System.out.print("Enter your number : ");
		int num = s.nextInt();// next digunakan untuk mendapatkan input berupa bilangan 
		System.out.println("Your number is " + num);
		System.out.print("Enter your decimal number : ");
		double numDec = s.nextDouble();// next digunakan untuk mendapatkan input berupa bilangan 
		System.out.println("Your Decimal number is " + numDec);
		System.out.print("Your name, please : ");
		String name = s.next();
		System.out.print("Your name, is : "  + name);*/
		/*System.out.print("Your complete name, please : ");		
		String namee = s.nextLine();
		System.out.print("Your complete name is  : " + namee);*/
		//System.out.print("Enter first number : ");
		/*int fst = s.nextInt();
		System.out.print("Enter second number : ");
		int scnd = s.nextInt();
		if(fst > scnd)
		{
			System.out.println(fst + " > " + scnd);
		}
		else if (fst < scnd) 
		{
			System.out.println(scnd + " > " + fst);
		}
		else
		{
			System.out.println(scnd + " = " + fst);
		}*/

		/*Buatlah koding sederhana utkmenguji apakah 
		  sebuah bilangan yang diinput user termasuk bilangan 
		  ganjil atau genap
		*/
	}
}
