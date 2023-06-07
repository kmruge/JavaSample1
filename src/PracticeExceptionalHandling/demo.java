package PracticeExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		int a=4;
		try {
		if(a>5)
		{
			new comeException().ji();
		}
		System.out.println("Entered number is valid");
		}
		catch(comeException ss)
		{
			System.out.println("Enter value less than 5");
		}
		try {
		vada hi=new vada();
		hi.show();
		}
		catch(InputMismatchException ff){
			System.out.println("Enter Number Only ");
		}
	}
}
class vada
{
	void show() throws ArithmeticException, InputMismatchException
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a/b;
		System.out.println(c);
	}
}
