package JavaDataStructure;
/*You are given an equation of the form x1+x2+...+xN=K. You need to find the total number of positive integral solutions of this equation.
 

Example 1:

Input: s = a+b=5
Output: 4
Explanation: (4,1) , (1,4) , (2,3) , (3,2)
public class pgm1 {

	public static void main(String[] args) 
	{
		int s=5;
		int result=0;
		int count=0;
		for(int i=1;i<s;i++)
		{
			int a=i;
			for(int j=1;j<s;j++)
			{
				result=i+j;
				if(result==5)
				{
					System.out.println("("+i+","+j+")");
					count++;
				}
			}
		}
		System.out.println("Number of possible result"+count);
	}

}*/

///Storing value in Map Object and 

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class pgm1 {

	public static void main(String[] args) 
	{
		int s=5;
		int result=0;
		int count=0;
		LinkedHashMap map=new LinkedHashMap();
		for(int i=1;i<s;i++)
		{
			int a=i;
			for(int j=1;j<s;j++)
			{
				result=i+j;
				if(result==5)
				{
					map.put(i, j);
					count++;
				}
			}
		}
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Map.Entry)it.next();
			System.out.println("("+entry.getKey()+","+entry.getValue()+")");
		}
		System.out.println("Number of possible result"+count);
	}

}
