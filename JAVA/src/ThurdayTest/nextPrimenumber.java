package ThurdayTest;


public class nextPrimenumber {

	public static void main(String[] args) {
		int n=20;
		for (int i = n+1; i <=100; i++) {
			int no=i;
			boolean flag=true;
			for (int j = 2; j < no; j++) {
				if(no%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(no+" is a prime number");
				break;
			}
			
		}
	}

}
