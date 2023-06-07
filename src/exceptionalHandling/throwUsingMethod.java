package exceptionalHandling;
//Checking User PassWords length using throw keyword with method caller
public class throwUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ijwwc";
		throwUsingMethodException ji=new throwUsingMethodException();
		try {
		ji.verifyPassWord(s);
		}
		catch(throwUsingMethodException dd){
			System.out.println("Too short ");
		}
	}

}
