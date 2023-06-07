package StaticBlock;

public class sampleStatic {
	void ni()
	{
		System.out.println("Static Block With Object");
	}
	static 
	{
		sampleStatic ji = new sampleStatic();
		ji.ni();
	}
	static
	{
		System.out.println("Static Block Without Object");
	}
	public static void main(String[] args) 
	{
		
	}

}
