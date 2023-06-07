package CollectionMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class mapSort {

	public static void main(String[] args) 
	{
		Map<String, Integer> unsortMap = new LinkedHashMap<String, Integer>();
        unsortMap.put("z", 5);
        unsortMap.put("a", 3);
        unsortMap.put("c", 9);
        for(String s:unsortMap.keySet())
        {
        	System.out.println(s);
        }
        for(Entry<String, Integer> ji:unsortMap.entrySet())
        {
        	System.out.println(ji);
        }
        for(Integer i:unsortMap.values())
        {
        	System.out.println(i);
        }
        System.out.println("In Sorted Order");
        Set<Entry<String,Integer>> set=unsortMap.entrySet();
        List<Entry<String,Integer>> list=new ArrayList<>(set);
        Collections.sort(list,(a,b)-> a.getKey().compareTo(b.getKey()));
        System.out.println(list);
        list.forEach(s->{
        	System.out.println(s.getKey()+" "+s.getValue());
        });
	}

}
