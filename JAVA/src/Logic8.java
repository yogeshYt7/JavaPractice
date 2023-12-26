

public class Logic8 {
	public static void main(String[] args) {
		String[] S1={"nayan","toyot","kanak","malayam","saras","mandya","amazon"};
		for(int i=0;i<S1.length;i++)
		{
			String str=S1[i];
		String reverse="";
		for(int j=str.length()-1;j>=0;j--)
		{
			reverse=reverse+str.charAt(j);
		}
		if(str.equals(reverse))
		{
			System.out.println(str+" is palindrome");
		}
		else{
			System.out.println(str+" is not a palindrome");
		}
		}

	}

}