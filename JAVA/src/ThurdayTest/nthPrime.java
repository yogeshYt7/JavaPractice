package ThurdayTest;


public class nthPrime {

	public static void main(String[] args) {

		int count=0;
		int value=4;
		for (int i = 3; i <=100; i++) {
			int no=i;
			boolean flag=true;
			for (int j = 2; j < no; j++) {
				if(no%j==0) {
					flag=false;
					break;
				}
			}
			if(flag)
			{
				if(count==value) {
				System.out.println(no+" is a prime number");
				break;
				}else {
					count++;
				}
			}
			
		}
	}

}
