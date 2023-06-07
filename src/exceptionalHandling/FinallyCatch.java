package exceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyCatch {
	private void divide() {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		try {
			System.out.println("Enter First value");
			int a=in.nextInt();
			System.out.println("Enter Second value");
			int b=in.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException cc)
		{
			System.out.println("Please Enter Non-Zero Numbers");
		}
		catch(InputMismatchException ee)
		{
			System.out.println("Please Enter number only");
		}
		catch(Exception tt)
		{
			System.out.println("Unknow Exception");
		}
		finally
		{
			System.out.println("Final Block");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyCatch fi=new FinallyCatch();
		fi.divide();
	}

}
