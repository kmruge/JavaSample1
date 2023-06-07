package CollectionsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class collectionsReverseOrder {
	String s;
	collectionsReverseOrder(String s)
	{
		this.s=s;
	}
	public String toString()
	{
		return this.s;
	}
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("e");
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reversing ArrayList String as a generic");
		list.forEach((b)->{
			System.out.print(b+" ");
		});
		LinkedList<collectionsReverseOrder> halist=new LinkedList<collectionsReverseOrder>();
		halist.add(new collectionsReverseOrder("c"));
		halist.add(new collectionsReverseOrder("a"));
		halist.add(new collectionsReverseOrder("b"));
		halist.add(new collectionsReverseOrder("d"));
		halist.add(new collectionsReverseOrder("e"));
		System.out.println("\nReversing LinkedList Object name as a generic ");
		Collections.sort(halist,Collections.reverseOrder(new comfi()));
		halist.forEach((b)->{
			System.out.print(b+" ");
		});
		HashMap<collectionsReverseOrder,Integer> ki=new HashMap();
		ki.put(new collectionsReverseOrder("c"), 1);
		ki.put(new collectionsReverseOrder("a"), 4);
		ki.put(new collectionsReverseOrder("b"), 3);
		ki.put(new collectionsReverseOrder("d"), 2);
		ki.put(new collectionsReverseOrder("e"), 5);
		Set<Entry<collectionsReverseOrder,Integer>> ji=ki.entrySet();
		ArrayList<Entry<collectionsReverseOrder,Integer>> hi=new ArrayList<Entry<collectionsReverseOrder,Integer>>(ji);
		Collections.sort(hi, Collections.reverseOrder(new comfo()));
		System.out.println("\nReversing Map using Collections.reverOrder");
		hi.forEach((c) ->{
			System.out.print("\n"+c.getKey()+" "+c.getValue());
		});
		System.out.println("\nReversing Map using normal comparator");
		Collections.sort(hi,new comgo());
		hi.forEach((c) ->{
			System.out.print("\n"+c.getKey()+" "+c.getValue());
		});
		System.out.println("\nReversing Map using Lambda Funtion");
		Collections.sort(hi, (a,b) -> {
			return b.getKey().s.compareTo(a.getKey().s);
		});
		for(Entry<collectionsReverseOrder,Integer> fi:hi)
		{
			System.out.println(fi.getKey()+" "+fi.getValue());
		}
		System.out.println("Reversing Array using collections.reverseOrder()");
		Integer[] no= {1,2,3,4,5};
		Arrays.sort(no,Collections.reverseOrder());
		System.out.println(Arrays.toString(no));
	}

}
class comfi implements Comparator<collectionsReverseOrder>
{

	@Override
	public int compare(collectionsReverseOrder o1, collectionsReverseOrder o2) {
		return o1.s.compareTo(o2.s);
	}
	
}
class comfo implements Comparator<Entry<collectionsReverseOrder,Integer>>
{

	@Override
	public int compare(Entry<collectionsReverseOrder, Integer> o1, Entry<collectionsReverseOrder, Integer> o2) {
		return o1.getKey().s.compareTo(o2.getKey().s);
	}
	
}
class comgo implements Comparator<Entry<collectionsReverseOrder,Integer>>
{

	@Override
	public int compare(Entry<collectionsReverseOrder, Integer> o1, Entry<collectionsReverseOrder, Integer> o2) {
		return o2.getKey().s.compareTo(o1.getKey().s);
	}
	
}
