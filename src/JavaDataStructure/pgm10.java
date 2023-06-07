package JavaDataStructure;
/*Input: S = "()(())("
Output: 6
Explanation: The longest valid 
substring is "()(())". Length = 6.

Input: S = "(()("
Output: 2
Explanation: The longest valid 
substring is "()". Length = 2.*/
public class pgm10 {

	public static void main(String[] args) {
		String s1="()()(()()()";
		 char[] c1=s1.toCharArray();
	        int countLeft=0;
	        int countRight=0;
	        for(int i=0;i<c1.length;i++)
	        {
	            if(c1[i]=='(')
	            {
	                countLeft++;
	            }
	            else if(c1[i]==')')
	            {
	                countRight++;
	            }
	        }
	        if(countLeft>countRight)
	        {
	            System.out.println(countRight*2);
	        }
	        else
	        {
	        	System.out.println(countLeft*2);
	        }
	}

}
