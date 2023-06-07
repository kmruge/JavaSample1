package exceptionalHandling;

import java.util.Scanner;

public class Finally {
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
		finally
		{
			System.out.println("Final Block");
		}
	}

	public static void main(String[] args) {
		Finally fi=new Finally();
		fi.divide();
	}

}
