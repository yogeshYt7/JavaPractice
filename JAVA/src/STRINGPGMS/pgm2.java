package STRINGPGMS;

public class pgm2 {

	public static void main(String[] args) {
		
        String str="hello";
        int n=3;
        print(str,n);
 

	}

	 static void print(String str, int n) {
		 
		for (int i = 0; i < n; i++) {
			System.out.println(str.substring(str.length()-n));
			
		}
	}

}
