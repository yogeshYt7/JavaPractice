package Programming;


class Sample{
	static int n=21;
	static String check() {
		String x;
		if((n%3==0) && (n%7==0)){
			x = "FOOBOO";
			return x;
		}
		else if(n%3==0){
			 x ="FOO";
			 return x;
		}
		else if(n%7==0) {
		     x = "BOO";
		     return x;
		}
		else
		{
			x = "INVALID NUMBER";
			return x;
		}
	}
}
public class foboreturn{
	
	public static void main(String[] args) {
		
		String y =Sample.check();
		System.out.println(y);
	}

}