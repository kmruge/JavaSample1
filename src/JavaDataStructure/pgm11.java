package JavaDataStructure;

import java.util.ArrayList;
import java.util.Arrays;

// Write code to filter duplicate elements from an array and print as a list
public class pgm11 {

	public static void main(String[] args) {
		String[] array= {"propagte", "viciously", "mushy","viciously"};
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<array.length;i++)
		{
			if(list.contains(array[i]))
			{
				
			}
			else
			{
				list.add(array[i]);
			}
		}
		System.out.println(list);

	}

}
