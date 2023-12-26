package Programming;


class gray1{
	static void check(int n) {
		if((n%3==0) && (n%7==0)){
			System.out.println("FOOBOO");
		}
		else if(n%3==0){
			System.out.println("FOO");
		}
		else if(n%7==0) {
		System.out.println("BOO");
		}
		else
			System.out.println("INVALID NUMBER");
	}
}
public class fobopara{
	
	public static void main(String[] args) {
		
		gray1.check(8);
	}

}