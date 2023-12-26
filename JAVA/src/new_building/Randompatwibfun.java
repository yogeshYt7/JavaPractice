package new_building;

public class Randompatwibfun {
	public static void main(String[] args) {
		String str="a2b4c3";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic((str.charAt(i))))
			{
				System.out.print(str.charAt(i));
			}
		else
		{
			int no=Character.getNumericValue(str.charAt(i));
			for(int k=1;k<no;k++)
			{
				System.out.print(str.charAt(i-1));
			}
		}
	}
	}
}

