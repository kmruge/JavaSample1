package JavaDataStructure;

import java.util.ArrayList;
import java.util.List;

// Write a pgm to find longest substring in the given string which doesn't contain any duplicate
public class pgm13 {

	public static void main(String[] args) {
		String s1="Murugueush";
		for(int i=0;i<s1.length();i++)
		{
			String subString=s1.substring(i, s1.length());
			List<Character> list=new ArrayList<Character>();
			char[] temp=subString.toCharArray();
			for(int j=0;j<temp.length;j++)
			{
				if(list.contains(temp[j]))
				{
					
				}
				else
				{
					list.add(temp[j]);
				}
			}
			if(temp.length==list.size())
			{
				System.out.println(subString);
				break;
			}
		}
	}

}
