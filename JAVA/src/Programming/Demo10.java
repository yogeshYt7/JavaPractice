package Programming;
//sum of factorial of first odd digits
public class Demo10 {

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
	 {     if(arr[i]%2==1) 
	 		{
		 		sum=sum+findfact(arr[i]);
		 		break;
	 		}
	 }
		System.out.println(sum);
}
public static void main(String[] args)
	{
	  int []arr={12,12,3,4,5,8,1};
	  findsum(arr);
	
	}
}
