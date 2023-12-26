package new_building;

public class Solution {
	 static int numbers(String no)
	{
		
		int sum=0;
		for(int i=0;i<no.length();i++)
		{
			
			char ch=no.charAt(i);
			int no1=Character.getNumericValue(ch);
			while(no1!=0)
				{
					int rem=no1%10;
					sum=sum+rem;
					no1=no1/10;
				}
			
		}
		return sum;
	}
	public static void main(String[] args) {
		String str="789";
		System.out.println(numbers(str));
	}
}
