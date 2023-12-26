package Programming;

class hello{
	static void check(int n) {
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
public class fbpara {
	public static void main(String[] args) {
		hello.check(21);
	}

}
