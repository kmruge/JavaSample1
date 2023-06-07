package JavaDataStructure;
//List the word based on given character 
// String s="Five more have been detained in the case";
// word e and N
import java.util.Arrays;
import java.util.List;

public class PrintingWordsBasedOnGivenChar {

	public static void main(String[] args) 
	{
		String s="Five more have been detained in the case";
		String s2=s.toUpperCase();
		String[] s1=s2.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String s3=s1[i];
			if(s3.contains("E")&&s3.contains("N"))
			{
				System.out.println(s3.toLowerCase());
			}
		}
		//Involving List
//		String s="Five more have been detained in the case";
//		String[] s1=s.split(" ");
//		List<String> list=Arrays.asList(s1);
//		for(String s3:list)
//		{
//			if(s3.contains("a")&&s3.contains("e"))
//			{
//				System.out.println(s3);
//			}
//		}
	}

}
