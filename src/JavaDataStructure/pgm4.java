package JavaDataStructure;

import java.util.HashMap;

/*  Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.*/
public class pgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{[][[[]()}";
		result(s);
		int a1=0,a2=0,b1=0,b2=0,c1=0,c2=0;
		for(int i=0;i<s.length();i++)
		{
			char at=s.charAt(i);
			switch(at)
			{
			case '{':
				a1++;
				break;
			case '}':
				a2++;
				break;
			case '[':
				b1++;
				break;
			case ']':
				b2++;
				break;
			case '(':
				c1++;
				break;
			case ')':
				c2++;
				break;
			default:
			}
		}
		if(a1==a2&&b1==b2&&c1==c2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

	private static void result(String s) 
	{
		System.out.println("Using Map Interface");
		HashMap<String,Integer> map=new HashMap();
		String[] st=s.split("");
		for(String s2:st)
		{
			if(map.containsKey(s2))
			{
				map.put(s2, map.get(s2)+1);
			}
			else
			{
				map.put(s2, 1);
			}
		}
		System.out.println(map);
	}

}
