package dynamic;

import java.util.Scanner;

public class Logic10 {
	static String rev(String str)
	{
	String reverse="";
	String[] s1=str.split(" ");
	for(int i=0;i<s1.length;i++)
	{
	if(i%2==1)
	{
		String str2=s1[i]+" ";

		for(int j=str2.length()-1;j>=0;j--){
			reverse=reverse+str2.charAt(j);
	}
		
	}
}
	return reverse;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string to be reversed:");
	String a=sc.nextLine();
	String b=rev(a);
	System.out.println(b);	
}

}
