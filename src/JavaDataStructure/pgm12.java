package JavaDataStructure;
// write pgm to remove the empty space from the string
public class pgm12 {

	public static void main(String[] args) {
//		String s="he is naugth piece of work";
//		String d=s.replace(" ", "");               // one way
//		System.out.println(d);
		String s="he is naugth piece of work";
		String d="";
		for(int i=0;i<s.length();i++)
		{
			char temp=s.charAt(i);
			if(temp!=' ')
			{
				d=d+String.valueOf(temp);
			}
		}
		System.out.println(d);
	}

}
