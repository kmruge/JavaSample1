package JavaDataStructure;
/*Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.

Example 1:

Input:
N = 4
a[] = {0,3,1,2}
Output: -1
Explanation: N=4 and all elements from 0
to (N-1 = 3) are present in the given
array. Therefore output is -1.
Example 2:

Input:
N = 5
a[] = {2,3,1,2,3}
Output: 2 3 
Explanation: 2 and 3 occur more than once
in the given array.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesInAnArray {
	public static ArrayList<Integer> duplicates(int arr[], int n) {
		Arrays.sort(arr);
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        Set set=map.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer,Integer> ki=(Map.Entry<Integer,Integer>)it.next();
            if(ki.getValue()>1)
            {
                list.add(ki.getKey());
            }
        }
        if(list.isEmpty())
        {
        	list.add(-1);
        }
        return list;
	}
	public static void main(String[] args)
	{
		int a[]={2,3,1,2,3};
		int n=a.length;
		System.out.println(FindDuplicatesInAnArray.duplicates(a, n));
	}

}
