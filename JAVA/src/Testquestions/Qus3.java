package Testquestions;

public class Qus3 {
	public static void main(String[] args) {
		int no=5;
		
		for(int i=no+1;i<100;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(i);
				break;
			}
			
		}
	}

}
