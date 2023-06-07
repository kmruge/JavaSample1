package JavaDataStructure;

import java.util.Arrays;

/*The task is to check whether two given strings are an anagram of each other or not.
 * An anagram of a string is another string that contains the same characters, only the order of characters can be different
 * Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have samecharacters with
        same frequency. So, both are anagrams.
Example 2:

Input:a = allergy, b = allergic
Output: NO
Explanation:Characters in both the strings are 
        not same, so they are not anagrams.
 */
public class pgm8 {
	void anagram(String input1,String input2)
	{
		char[] at1=input1.toCharArray();
		char[] at2=input2.toCharArray();
		Arrays.sort(at1);
		Arrays.sort(at2);
		String out1=String.valueOf(at1);
		String out2=String.valueOf(at2);
		if(out1.equals(out2))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		String in11="welcome";
		String in12="comewel";
		String in21="comealone";
		String in22="lonecome";
		pgm8 obj=new pgm8();
		obj.anagram(in11, in12);
		obj.anagram(in21, in22);
		
		
		
	}

}
