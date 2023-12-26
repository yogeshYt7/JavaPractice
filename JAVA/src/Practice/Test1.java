package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		int N=4;
		int K =3;
		 a1.add(1);
		 a1.add(2);
		 a1.add(5);
		 a1.add(4);
		 Collections.sort(a1);
		 System.out.println(a1); 
		 System.out.println( a1.get(K-1));//third largest
		 System.out.println( a1.get(N-K));//third smallest
		 
		
		
  }
}