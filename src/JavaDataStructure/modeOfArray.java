package JavaDataStructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class modeOfArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,2,5,5};
//		int position=0;
//		int count=0;
//		for(int i=0;i<a.length;i++)
//		{
//			int innercount=1;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					innercount++;
//				}
//			}
//			if(count<innercount)
//			{
//				count=innercount;
//				position=i;
//			}
//		}
//		System.out.println("Max occurance is "+a[position] + " ="+count );
		HashMap<Integer,Integer> map=new HashMap();
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
	}

}
