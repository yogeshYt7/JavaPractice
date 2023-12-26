package ThurdayTest;

public class happynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=19;
        while(n>9) {
        	n=add(n);	
        }
        if(n==1 || n==7) {
        	System.out.println("happy number");
        }else 
        { 
        System.out.println(" not happy number");

        }
	}

	 static int add(int n) {
		 int sum=0;
		 while(n!=0) {
			 int rem=n%10;
			 sum=sum+rem*rem;
			 n=n/10;
		 }			 
		return sum;
	}

}
