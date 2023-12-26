package YOGESH;

public class a2b2c2TOaabbbc {
	public static void main(String[] args) {
		String str="aabccc";
		for (int i = 0; i < str.length(); i++)
		{
			if (Character.isAlphabetic(str.charAt(i))) 
			{
//				System.out.print(str.charAt(i));			
			}else {
				int no=Character.getNumericValue(str.charAt(i));
				for (int j = 0; j <=no; j++) 
				{
					System.out.print(str.charAt(i+1));
				}
			}
			
		}
	}

}
