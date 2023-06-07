package JavaDataStructure;

import java.util.Arrays;

public class ReverseElementInArray {
	public static void main(String[] args) {
//		int a[]= {8,2,4,6,2,3};
//		int ini=0;
//		int last=a.length-1;
//		while(ini<last)
//		{
//			int b=a[ini];
//			a[ini]=a[last];
//			a[last]=b;
//			ini++;
//			last--;
//		}
//		System.out.println(Arrays.toString(a));
		int a[]= {8,2,4,6,2,3,1};
		int length=a.length;
		int mid=a.length/2;
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[length-1];
			a[length-1]=temp;
			length--;
		}
		System.out.println(Arrays.toString(a));
	}

}
