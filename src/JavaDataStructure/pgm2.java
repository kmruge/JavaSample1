package JavaDataStructure;

import java.util.Arrays;

public class pgm2 {

	public static void main(String[] args) 
	{
		int height[]= {1, 20, 12, 16, 14};
		int reducer=2;
		int re_Height[]=new int[height.length];
		int d=heightOfTower(height,re_Height,reducer);
		System.out.println("Different between Maximum and Minimum height of the tower is :" +d);
	}
	static int heightOfTower(int a[],int b[],int c)
	{
		int result=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<c)
			{
				b[i]=a[i]+c;
			}
			else
			{
				b[i]=a[i]-c;
			}
		}
		System.out.print("Increased or Decreased Height of Tower \n{");
		for(int d:b)
		{
			System.out.print(" "+d);
		}
		System.out.println(" }");
		Arrays.sort(b);
		result=b[b.length-1]-b[0];
		return result;
	}

}
