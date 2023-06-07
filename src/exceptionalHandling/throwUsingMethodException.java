package exceptionalHandling;

public class throwUsingMethodException extends Exception {
//	String s;
//	lengthException()
//	{
//		
//	}
	void verifyPassWord(String s) throws throwUsingMethodException
	{
		if(s.length()<8)
		{
//			throwUsingMethodException li=new throwUsingMethodException();
//			throw li; 
			
//			or
			throw new throwUsingMethodException();
		}
		System.out.println("Strong PassWord");
	}

}
