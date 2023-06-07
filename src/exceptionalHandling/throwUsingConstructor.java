package exceptionalHandling;

public class throwUsingConstructor {

	public static void main(String[] args){
		String s="iuiedufoue";
		try {
		if(s.length()<8)
		{
			throw new throwUsingConstructorException(s);
		}
		else
		{
			System.out.println("Strong PassWords");
		}
		}
		catch(throwUsingConstructorException dd)
		{
			
		}
	}

}
