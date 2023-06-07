package JavaDataStructure;
/*Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9*/
import java.util.Arrays;

public class MissingNumberInArray {
	int MissingNumber(int array[], int n) {
        int a=0;
        Arrays.sort(array);
        int differ=n-array.length;
        for(int i=0;i<array.length;i++)
        {
            
           if(array[i]!=differ)
           {
               break;
           }
           differ++;
        }
        return differ;
    }

	public static void main(String[] args) {
		int N = 5;
	    int A[] = {1,2,3,5};
	    MissingNumberInArray ji=new MissingNumberInArray();
	    System.out.println(ji.MissingNumber(A,N));
	}
}
