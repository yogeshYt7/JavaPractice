package Programming;


class hii{
	static int n=21;
	static void check() {
		if((n%3==0) && (n%7==0)){
			System.out.println("FIZZBUZZ");
		}
		else if(n%3==0){
			System.out.println("FIZZ");
		}
		else
		System.out.println("BUZZ");
	}
}
public class Fooboo1 {
	
	public static void main(String[] args) {
		
		hii.check();
	}

}
