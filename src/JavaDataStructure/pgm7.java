package JavaDataStructure;
//Sorting String without using Array.sort key
public class pgm7 {
		public static void main(String[] args)
		{
		    String s="dcbazyw";
			String s2="";
			char[] at=s.toCharArray();
			for(int i=0;i<at.length;i++)
			{
				for(int j=i+1;j<at.length;j++)
				{
					char at1=at[i];
					if(at1>at[j])
					{
						at[i]=at[j];
						at[j]=at1;
					}
				}
			}
			for(char k:at)
			{
				s2=s2+k;
			}
			System.out.println(s2);

	}

}
