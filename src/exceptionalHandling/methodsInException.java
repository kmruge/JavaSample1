package exceptionalHandling;

import java.util.Scanner;

public class methodsInException {
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
			cc.printStackTrace();
			System.out.println(cc.getMessage());
			divide();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodsInException ji=new methodsInException();
		ji.divide();

	}

}
