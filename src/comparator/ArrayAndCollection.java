package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayAndCollection 
{
	String name;
	ArrayAndCollection(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return this.name;
	}
	public static void main(String[] args)
	{
		ArrayAndCollection A=new ArrayAndCollection("Arun");
		ArrayAndCollection B=new ArrayAndCollection("brun");
		ArrayAndCollection C=new ArrayAndCollection("Crun");
		ArrayList list=new ArrayList();
		list.add(A);
		list.add(B);
		list.add(C);
//		comparatordemo1 cd=new comparatordemo1();
		Collections.sort(list,new comparatordemo1());
		System.out.println(list);
		Double s[]= {2.5,2.7,2.6};
		Arrays.sort(s,new comparatordemo2());
		System.out.println(Arrays.toString(s));
	}
}
class comparatordemo2 implements Comparator<Double>
{

	@Override
	public int compare(Double o1, Double o2)
	{
		
		Double result=o1-o2;
		return result>0?-1:((result<0)?1:0);
	}
}
class comparatordemo1 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		ArrayAndCollection i1=(ArrayAndCollection)o1;
		ArrayAndCollection i2=(ArrayAndCollection)o2;
		int result=i1.name.compareToIgnoreCase(i2.name);
		return result>0?-1:((result<0)?1:0);
	}
	//This is also one of the way to compare the class object without type casting it.
//	@Override
//	public int compare(ArrayAndCollection o1, ArrayAndCollection o2)
//	{
//		int result=o1.name.compareToIgnoreCase(o2.name);
//		return result>0?-1:((result<0)?1:0);
//	}
}
