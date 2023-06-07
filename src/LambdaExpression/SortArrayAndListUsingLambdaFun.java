package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class SortArrayAndListUsingLambdaFun {
	String s;
	SortArrayAndListUsingLambdaFun(String d)
	{
		this.s=d;
	}
	
	public String toString()
	{
		return this.s;
	}
	public static void main(String[] args) {
		String [] s= {"apple","cat","ball"};
		System.out.println("Before Sorting Array"+Arrays.toString(s));
		Arrays.sort(s, (a,b) -> { return a.compareTo(b);});
		System.out.println("After Sorting Array"+Arrays.toString(s));
		List<String> list=new LinkedList();
		list.add("cat");
		list.add("ball");
		list.add("apple");
		System.out.println("Before Sorting List"+list);
		Collections.sort(list,(a,b) ->   a.compareTo(b));
		System.out.println("After Sorting List"+list);
		ArrayList<SortArrayAndListUsingLambdaFun> kgf=new ArrayList<SortArrayAndListUsingLambdaFun>();
		kgf.add(new SortArrayAndListUsingLambdaFun("apple"));
		kgf.add(new SortArrayAndListUsingLambdaFun("cat"));
		kgf.add(new SortArrayAndListUsingLambdaFun("ball"));
		Collections.sort(kgf, (a,b) -> { return b.s.compareTo(a.s); });
		System.out.println(kgf);
		HashMap<SortArrayAndListUsingLambdaFun, Integer> map=new HashMap<SortArrayAndListUsingLambdaFun, Integer>();
		map.put(new SortArrayAndListUsingLambdaFun("ball"), 1);
		map.put(new SortArrayAndListUsingLambdaFun("apple"), 2);// 
		map.put(new SortArrayAndListUsingLambdaFun("apple"), 3);
		Set<Entry<SortArrayAndListUsingLambdaFun,Integer>> set=map.entrySet();
		ArrayList<Entry<SortArrayAndListUsingLambdaFun,Integer>> li=new ArrayList<Entry<SortArrayAndListUsingLambdaFun,Integer>>(set);
		Collections.sort(li,(a,b)-> {  });
	}
}
