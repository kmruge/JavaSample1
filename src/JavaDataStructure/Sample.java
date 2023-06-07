package JavaDataStructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int a[]= {1,1,2,2,3,3};
		for(int i=0;i<a.length;i++)
		{
			int b=a[i];
			if(map.containsKey(b))
			{
				map.put(b, map.get(b)+1);
			}
			else
			{
				map.put(b, 1);
			}
		}
		System.out.println(map);
	}
}
