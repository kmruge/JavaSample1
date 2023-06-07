package JavaDataStructure;

import java.util.ArrayList;
import java.util.List;

/* String palindrome 
 * input="appa"
 * out=1
 * 
 * input="abc"
 * out=o
 */
public class pgm5 {

	public static void main(String[] args)
	{
		String s="appa";
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char at=s.charAt(i);
			s=s+at;
		}
		System.out.println(s);
		if(s2.equals(s))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
