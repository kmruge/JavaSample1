package exceptionalHandling;

public class ThrowsKeyWords {
	public static void main(String[] args)
	{
		ThrowsKeyWords ji=new ThrowsKeyWords();
		try
		{
		ji.display();
		}
		catch(Exception cc)
		{
			System.out.println("exception occurs in main");
		}
	}

	private void display() throws Exception {
		// TODO Auto-generated method stub
		throwsdemo1 obj=new throwsdemo1();
		try {
		obj.calculate();
		}
		catch(Exception dd)
		{
			System.out.println("exception occurs in Calculator");
		}
	}
}
class throwsdemo1
{
	void calculate() throws Exception
	{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
}
