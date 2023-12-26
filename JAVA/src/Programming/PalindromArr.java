package Programming;

public class PalindromArr {
	
		public static void main(String[] args) {
			String [] str={"PINYA","KANAK","MALAYALAM","TOYOT","SARAS","MANDYA"};
			
			
			for (int i=str.length-1;i>=0; i--) 
			{ String reverse ="";
			System.out.print(str[i]+" ");
			
				for (int j =str [i].length()-1; j >=0; j--)
					{
						reverse= reverse+str[i].charAt(j);
						
					}	
				System.out.print(reverse+" ");
			
		if (str[i].equals(reverse)) {
			System.out.println( "String  is palindrome");
		}
			else 
			{
				System.out.println( "String is not palindrome");
			}
		}	
			
			
		}
	

	}

