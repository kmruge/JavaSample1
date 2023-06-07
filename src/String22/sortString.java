package String22;

public class sortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="DBCA";
		char[] c1=s1.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			for(int j=i+1;j<c1.length;j++)
			{
				if(c1[i]>c1[j])
				{
					char temp=c1[i];
					c1[i]=c1[j];
					c1[j]=temp;
				}
			}
		}
		s1=String.valueOf(c1);
		System.out.println(s1);
	}

}
