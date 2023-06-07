package CollectionMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Checking maximum and minimum Occurance Of Word And Letter in the String Array and String Respectively
public class CountOccuranceOfLetter {
	void countLetter(String st1)
		{
			char[] ch = st1.toCharArray();
			HashMap<Character, Integer> map = new HashMap();
			for(char ch1:ch) 
			{
				if (map.containsKey(ch1)) {
					map.put(ch1, map.get(ch1)+1);
				}
				else 
				{
					map.put(ch1, 1);
				}
			}
			Set ss = map.entrySet();
			Iterator it=ss.iterator();
			int result=0;
			char reff=' ';
			while(it.hasNext())
			{
				Map.Entry<Character, Integer> entry=(Map.Entry)it.next();
				if(entry.getValue()>result)
				{
					result=entry.getValue();
					reff=entry.getKey();
				}
			}
			System.out.println("CountLetter : The Maximum Occurance present in given String is "+reff+" Count of "+result);
			
		}

		public static void main(String args[]) {
			String st2 = "mani kumar mani vasu";
			CountOccuranceOfLetter dc = new CountOccuranceOfLetter();
			dc.countLetter("comecome");
			dc.countWord(st2);
		}

		private void countWord(String string) 
		{
			String[] arr=string.split("\\D ");
			HashMap<String,Integer> map=new HashMap();
			for(String obj:arr)
			{
				if(map.containsKey(obj))
				{
					map.put(obj, map.get(obj)+1);
				}
				else
				{
					map.put(obj,1);
				}
			}
			System.out.println(map);
			int result=0;
			String reff=" ";
			for(Entry<String, Integer> mm:map.entrySet())
			{
				if(mm.getValue()==1)
				{
					result=mm.getValue();
					reff=mm.getKey();
					break;
				}
			}
			System.out.println("CountWord : First Minimum  Occurance present in given String is "+reff+" Count of "+result);
		}

}