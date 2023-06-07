package exceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class manyCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manyCatch obj=new manyCatch();
		obj.divide();

	}

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
		catch(ArithmeticException hh)
		{
			System.out.println("Please Enter Non-Zero Numbers");
			divide();
		}
		catch(InputMismatchException hh)
		{
			System.out.println("Please Enter Numbers Only");
			divide();
		}
		catch(Exception hh)
		{
			System.out.println("Unknows error hanpped");
			divide();
		}
	}

}
