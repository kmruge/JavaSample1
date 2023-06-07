package JavaDataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class DemoSample extends Demo
{
	public static void main(String[] args)
	{
		String arr[]= {"geekforgeeks","geekfo","geekorgeek"};
		String smallText=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            String st=arr[i];
            if(st.length()<smallText.length())
            {
                smallText=st;
            }
        }
        System.out.println(smallText);
        for(int i=smallText.length()-1;i>=0;i--)
        {
        	String substring=smallText.substring(0,i);
        	boolean con=false;
        	for(int j=0;i<arr.length;i++)
        	{
        		if(arr[j].contains(substring))
        		{
        			con=true;
        		}
        		else
        		{
        			con=false;
        		}
        	}
        	if(con)
        	{
        		System.out.println(substring);
        	}
        }
	}
}
