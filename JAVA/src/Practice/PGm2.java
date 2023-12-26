package Practice;

public class PGm2 {

		static boolean palindrome(String str)
		{   
			char[]ch=str.toCharArray();
			int i=0;
			int j=ch.length-1;
			while(i<j) {
				if(ch[i]!=ch[j])
				{
					return false;
				}
				i++;
				j--;
			}
			return true;
		}

		public static void main(String[] args)
		{ 
			String str="DAD";
			if( palindrome(str))
			{
				System.out.println("palindrome");
			}
			
			

		}

	}
