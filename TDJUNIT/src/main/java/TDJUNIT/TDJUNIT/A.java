package TDJUNIT.TDJUNIT;

public class A {

	public static Object delete(String string) 
	{
		 String  result=string;
		 int stringlen=string.length();
		 if(stringlen>=2)
		 {
			 char k = string.charAt(0);
			 char p=string.charAt(1);
			 if(k!='A'&&p!='A')
			 {
				 return result;
			 }
			 else
			 {
				if(k=='A'&&p=='A')
				{
					result=string.substring(2,stringlen);
				}
				else if(k=='A'&&p!='A')
				{
					result=string.substring(1,stringlen);
				}
				else if(k!='A'&&p=='A')
				{
					result=string.charAt(stringlen-stringlen)+string.substring(2,stringlen);
				}
				return result;
			 }
		 }
		 else if(stringlen<=1)
		 {
			 return result;
		 }
	
		return null;
	}

}
