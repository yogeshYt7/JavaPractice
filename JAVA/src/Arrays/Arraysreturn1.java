package Arrays;
import java.util.Scanner;
public class Arraysreturn1 
{
	static String javacount(String  Str)
	{
		String K="JAVA";
		String [] S1= Str.split(" ");
		int count =0;
		for (int i = 0; i < S1.length; i++) 
			{
					 if (S1[i].equals(K))
					 {
						 count++;
					 }
				
			}
		
			return(K +" --> "+ count);
		
	}

	public static void main(String[] args) {
		Scanner K1=new Scanner(System.in);
		System.out.println(" enter value");
		String Str= K1.nextLine();    //"HELLO JAVA HII JAVA HOW ARE YOU JAVA"
		String X=javacount(Str);
		System.out.println(X);
		
		
	}
		

}
