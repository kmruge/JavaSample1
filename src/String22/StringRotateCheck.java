package String22;

public class StringRotateCheck {

	public static void main(String[] args) 
	{
		String str1="amazon";
		String str2="azonam";
		System.out.println(StringRotateCheck.isRotated(str1, str2));
	}
	public static boolean isRotated(String str1, String str2)
    {
        int ini=0;
        int end=1;
        boolean con=false;
        while(end<str1.length())
        {
            String emp="";
            for(int i=0;i<str1.length();i++)
            {
                if(i==ini||i==end)
                {
                    
                }
                else
                {
                    char cha=str1.charAt(i);
                    emp=emp+cha;
                }
            }
            emp=emp+str1.charAt(ini);
            emp=emp+str1.charAt(end);
            if(emp.equals(str2))
            {
                con=true;
                break;
            }
            else
            {
                ini++;
                end++;
            }
            System.out.println(emp);
        }
        if(con)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
