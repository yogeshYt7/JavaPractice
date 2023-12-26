package Practice;

public class Pgm3 {
	public static void main(String[] args) {
		int num=23;
		for (int i =num ; i < 1000; i++) 
		{
			int no=i+1;

	boolean flag=true;
	
    for(int j=2; j<no;j++)
    	{
  	
		
  	  if(no%j==0)
		{
  		  	flag=false;
  		  	break;
	    }
 
    	}
    if(flag==true)
	{
		System.out.println(no+" prime number");
		break;
	}
	
		
   }
}
}



