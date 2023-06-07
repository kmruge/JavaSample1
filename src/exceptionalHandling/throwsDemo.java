package exceptionalHandling;

import java.util.Scanner;

public class throwsDemo {

	public static void main(String[] args) throws Exception {
		throwsDemo obj=new throwsDemo();
		try {
		obj.display();
		}
		catch(Exception cc)
		{
			System.out.println("Exception Occurs");
			
		}
		
	}

	private void display() throws Exception {
		// TODO Auto-generated method stub
		error ji=new error();
		try
		{
		ji.calculate();
		}
		catch(ArithmeticException cc)
		{
			System.out.println("Arithmetic exception happened ");
			display();
		}
		ji.calculate1();
	}

}
class error
{
	void calculate()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Two values");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=a/b;
		System.out.println(c);
		}
	void calculate1()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=in.nextLine();
		System.out.println(s1);
		}
}
