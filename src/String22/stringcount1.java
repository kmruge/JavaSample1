package String22;

public class stringcount1 {

	public static void main(String[] args) {
		String s1="ABAABAA";
		String s2="ABA";
		int l1=s1.length();
		int l2=s2.length();
		int l3=s2.length();
		int count=0;
		for(int i=0;i<=l1-l2;i++)
		{
			String s3=s1.substring(i,l3);
			if(s3.equals(s2))
			{
				count++;
			}
			l3++;
		}
		for(int i=l1;i>=l2;i--)
		{
			int l4=i-l2;
			String s3=s1.substring(l4,i);
			String s4="";
			for(int j=s3.length()-1;j>=0;j--)
			{
				s4=s4+s3.charAt(j);
			}
			if(s4.equals(s2))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
