package JavaDataStructure;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class pgm9
{
	char nonrepeatingChar(String s)
	{
		System.out.println("Using Logics");
		char d='&';
		char[] at=s.toCharArray();
		int[] count=new int[at.length];
		for(int i=0;i<at.length;i++)
		{
			if(count[i]==0)
			{
				int a=-1;
				for(int j=i+1;j<at.length;j++)
				{
					if(at[i]==at[j])
					{
						a=1;
						count[j]=-1;
						break;
					}
				}
				if(a==-1)
				{
					d=at[i];
					break;
				}
			}
		}
		return d;
	}
	public static void main(String[] args)
	{
		
		String s = "zxvczbtxyzvy";
		pgm9 obj = new pgm9();
		System.out.println(obj.nonrepeatingChar(s));
		System.out.println(obj.usingMap(s));
		System.out.println("Using map with Map.entry");
		LinkedHashMap<Character,Integer> map=new LinkedHashMap();
		char[] at=s.toCharArray();
		for(int i=0;i<at.length;i++)
		{
			if(map.containsKey(at[i]))
			{
				map.put(at[i], map.get(at[i])+1);
			}
			else
			{
				map.put(at[i], 1);
			}
		}
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Character, Integer> entry=(Map.Entry<Character, Integer>)itr.next();
			if(entry.getValue().equals(1))
			{
				System.out.println(entry.getKey());
				break;
			}
		}
	}
	private char usingMap(String s) 
	{
		System.out.println("Using Map Interface");
		LinkedHashMap<Character,Integer> map=new LinkedHashMap();
		char[] at=s.toCharArray();
		for(int i=0;i<at.length;i++)
		{
			if(map.containsKey(at[i]))
			{
				map.put(at[i], map.get(at[i])+1);
			}
			else
			{
				map.put(at[i], 1);
			}
		}
		for(Character c:map.keySet())
		{
			if(map.get(c)==1)
			{
				return c;
			}
		}
		return '&';
		
	}
}

