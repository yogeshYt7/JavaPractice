package Programming;

public class happpy {
	public static void main(String[] args) {
		int no=28;
		int sum=0;
		while(no>9) {
			int rem=no%10;
			sum=sum+summ(rem);
			
		}
		System.out.println(sum+"is happy number");
	}
		 static int summ(int r) {
			int a=0;
			while(r!=0) {
				int rs=r%10;
				a=a+r;
				rs=rs%10;
			
			}
			return a;
		}
		
		

}
