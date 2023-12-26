package Programming;
// sum of factorial each digit 
public class Demo {
 static int findfact(int no)
 { int fact=1;
	 for (int i = no; i>=1; i--) 
	 {
		fact=fact*i;
	 }
	 return fact;
 }
 static void findsum(int[]arr)
 { int sum=0;
	 for (int i = 0; i < arr.length; i++)
	 {
		sum=sum+findfact(arr[i]);
	 }
		System.out.println(sum);
 }
 public static void main(String[] args)
 	{
	  int []arr={1,2,3,4,5};
	  findsum(arr);
	
 	}
}
 