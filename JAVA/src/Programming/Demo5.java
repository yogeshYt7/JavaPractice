package Programming;
//sum of factorial of which last even
public class Demo5
{
	
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
	 for (int i =arr.length-1; i>=0 ;i--)
	 {     if(arr[i]%2==0) 
	 	{
		 sum=sum+findfact(arr[i]); 
		 break;
		}
	 
	 }
	 
		System.out.println(sum);
}
public static void main(String[] args)
	{
	  int []arr={1,21,3,4,5,8,1};
	  findsum(arr);
	
	}
}
