package Programming;


class gray{
	static int n=21;
	static void check() {
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
public class fobo{
	
	public static void main(String[] args) {
		
		gray.check();
	}

}
