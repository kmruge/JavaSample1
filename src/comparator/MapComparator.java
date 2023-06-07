package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapComparator {
	String s;
	MapComparator(String s)
	{
		this.s=s;
	}
	public String toString()
	{
		return s;
	}
	public static void main(String[] args) {
		HashMap<MapComparator,Integer> map=new HashMap<MapComparator,Integer>();
		map.put(new MapComparator("ball"), 93);
		map.put(new MapComparator("apple"), 93);
		map.put(new MapComparator("dog"), 93);
		map.put(new MapComparator("cat"), 93);
		Set<Entry<MapComparator,Integer>> set=map.entrySet();
		ArrayList<Entry<MapComparator,Integer>> list=new ArrayList<Entry<MapComparator,Integer>>(set);
		Collections.sort(list,(o1,o2) -> { return o2.getKey().s.compareTo(o1.getKey().s); });
		for(Entry l:list)
		{
			System.out.println(l);
		}
		
	}

}
class compo implements Comparator<Entry<MapComparator,Integer>>
{

	@Override
	public int compare(Entry<MapComparator, Integer> o1, Entry<MapComparator, Integer> o2) {
		
		return o1.getKey().s.compareTo(o2.getKey().s);
	}
	
}
