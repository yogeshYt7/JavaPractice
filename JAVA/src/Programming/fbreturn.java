package Programming;

class helio{
	static int n=21;
	static String check() {
		String x;
		if((n%3==0) && (n%7==0)){
			x ="FIZZBUZZ";
			return x;
		}
		else if(n%3==0){
			x= "FIZZ";
			return x;
		}
		else {
		      x = "BUZZ";
		      return x;
		  }
		}
}
public class fbreturn {
	
	public static void main(String[] args) {
		
		String y = helio.check();
		System.out.println(y);
	}

}
