package String22;

public class stringcount {

	public static void main(String[] args)
	{
		String s1="ABAAABAB";
		String s2="AB";
		int count=0;
		int l1=s1.length();
		int l2=s2.length();
		for(int i=0;i<=l1-l2;i++)
		{
			int k=i;
			int count1=0;
			for(int j=0;j<l2;j++)
			{
				if(s1.charAt(k)==s2.charAt(j))
				{
					count1++;
					k++;
				}
			}
			if(count1==l2)
			{
				count++;
			}
		}
		for(int i=l1-1;i>=l2;i--)
		{
			int count1=0;
			int k=i;
			for(int j=0;j<l2;j++)
			{
				if(s1.charAt(k)==s2.charAt(j))
				{
					count1++;
					k--;
				}
			}
			if(count1==l2)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
