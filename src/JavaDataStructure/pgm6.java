package JavaDataStructure;
/*Your task is to implement the function strstr.
 * The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s.
 * Input:
s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the
string GeeksForGeeks as substring.

Input:
s = GeeksForGeeks, x = For
Output: 5
Explanation: For is present as substring
in GeeksForGeeks from index 5 (0 based
indexing).
 */
public class pgm6 {

	public static void main(String[] args) {
		String input="GeeksForGeeks";
		String x="Fr";
		String y="For";
		System.out.println("Checking "+x+" is present or not (5 means yes -1 means no) "+result(input,x));
		System.out.println("Checking "+y+" is present or not (5 means yes -1 means no) "+result(input,y));

	}

	private static int result(String input, String x) {
		int a=0;
		if(input.contains(x))
		{
			a=5;
		}
		else
			a=-1;
		return a;
	}

}
