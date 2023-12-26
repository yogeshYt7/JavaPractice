package Programming;
//sum of factorial of each digits from reverse order
public class Demo1 {

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
	 for (int  i=arr.length-1; i>=0; i--)
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

