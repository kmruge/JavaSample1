package JavaDataStructure;
/*Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K.
Decrease the height of the tower by K ( you can do this operation only if the height of the tower is greater than or equal to K)
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower.


Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5.*/

import java.util.Arrays;

public class MinimizetheHeightsII {
	int getMinDiff(int[] arr, int n, int k) {
        for(int i=0;i<n;i++)
        {
            if(arr[i]<k)
            {
                arr[i]=arr[i]+k;
            }
            else if(arr[i]>k)
            {
                arr[i]=arr[i]-k;
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
        return arr[n-1]-arr[0];
    }
	static public void main(String[] args)
	{
		int a[]= {1, 5, 8, 10};
		int n=a.length;
		int k=4;
		MinimizetheHeightsII ji=new MinimizetheHeightsII();
		System.out.println(ji.getMinDiff(a, n, k));
	}

}
