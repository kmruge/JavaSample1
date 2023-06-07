package LambdaExpression;
public interface InterfaceDemo {
	public void print(int a, int b);
	default int multi()
	{
		return 1;
	}
	static void sub()
	{
		System.out.println("Enter");
	}

}
