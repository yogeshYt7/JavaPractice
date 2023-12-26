package Programming;

public class Reversestring {
	
	static void xyz(String []str) 
	{
			for (int i=str.length-1;i>=0; i--) 
			{ 
				String reverse ="";
				
				for (int j =str [i].length()-1; j >=0; j--)
					{
						reverse= reverse+str[i].charAt(j);
						
					}	
				System.out.print(reverse+" ");
			}
			
	}

	
	
	public static void main(String[] args) {
		String [] str={"KEDHARANATH","AMARNATH","BHADRNATH","DAWARAKH","BRINDHAVAN","KASHI"};
		xyz(str);

	
			
		}
	
}
