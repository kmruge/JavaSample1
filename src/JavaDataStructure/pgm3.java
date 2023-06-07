package JavaDataStructure;
/*Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
Example 2:

Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is 
the majority element.*/
public class pgm3 {

	public static void main(String args[])
	{
		int A[] = {3,1,3,3,2};
		double N=5;
		majorityElement(A,N);
	}
	public static void majorityElement(int a[],double b)
	{
		
		int swap=0;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(swap<count)
			{
				swap=count;
			}
		}
		if(b/2<swap)
		{
			System.out.println(swap);
		}
		else
		{
			System.out.println(-1);
		}
	}

}
