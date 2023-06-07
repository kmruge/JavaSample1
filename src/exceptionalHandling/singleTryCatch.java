package exceptionalHandling;

public class singleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException cc)
		{
			System.out.println("Arithmetic Exception Occurs Please try again");
		}
	}

}
