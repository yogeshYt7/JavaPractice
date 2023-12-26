package Programming1;

public class Nextprime {
public static void main(String[] args) {
	int a=5;
	for (int i = a+1; i <=100; i++) 
	{
		int no=i;
		boolean flag=true;
		for (int j = 2; j < no; j++)
		{   
				if(no%j==0) 
				{
					flag =false;
					break;
			    }
	    }
	
				if (flag==true)
				{
					System.out.println(no +" is next prime number of "+a );
					break;
					
				}
	
	
}
}
}
