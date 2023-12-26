package Programming;

public class Demo12 {
	
static int findfact(int no)
{ int fact=1;
	 for (int i=no; i<=4; i++) 
	 {
		fact=fact*(fact*i)*(fact*i)*(fact*i);
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
	  int []arr={3,4,5,8,1};
	  findsum(arr);
	
	}
}
