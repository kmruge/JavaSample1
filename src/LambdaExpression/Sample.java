package LambdaExpression;
import java.util.*;
import java.util.Comparator;

public class Sample 
{
	static public void main(String[] args)
	{
		InterfaceDemo cd=(a,b) ->{
			if(a<b)
			{
				throw new RuntimeException("Explicitly throwed RuntimeException");
			}
			else
			{
				System.out.println("Answere is "+a+b);
			}
		};
		cd.print(5, 10);
	}
}
