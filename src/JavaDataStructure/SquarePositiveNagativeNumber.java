package JavaDataStructure;

import java.util.Arrays;

//Sqared output (9,49,16,64,49)
//sorted ouput (9,16,49,49,64)
public class SquarePositiveNagativeNumber {

	public static void main(String[] args) 
	{
		int a[]= {-3,-2,5,4};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
			int temp=a[i];
			temp=temp*temp;
			a[i]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
