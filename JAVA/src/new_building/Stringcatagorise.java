package new_building;

public class Stringcatagorise 
{
	public static void main(String[] args) {
		String s1="PR@#4ogr!A7mm$iN89g";
		String cps="";
		String lc="";
		String num="";
		String spc="";
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{
				cps=cps+ch;
				
			}
			else if(ch>='a' && ch<='z')
			{
				lc=lc+ch;
				
			}
			else if(ch>='0' && ch<='9')
			{
				num=num+ch;
				
			}
			else
			{
				spc=spc+ch;
				
			}
			
		}
		System.out.println(cps);
		System.out.println(lc);
		System.out.println(num);
		System.out.println(spc);
	}
	  
	
	

}
