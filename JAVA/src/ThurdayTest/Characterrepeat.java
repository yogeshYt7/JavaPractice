package ThurdayTest;



//input a10b12c7 output aaaaaaaaaabbbbbbbbbbbbcccccc


public class Characterrepeat {
	public static void main(String[] args) {
        String str = "a10b12c7";
        
        String s1=str.replaceAll("[0-9]", "");
        String s2=str.replaceAll("[a-zA-Z]", " ");
        
        String[] str1=s1.split("");
        String[] str2=s2.split(" ");
        
        
        for (int i = 1; i <str2.length; i++) {
			int n=Integer.parseInt(str2[i]);
			print(n,str1[i-1]);
		}

	}
	
	static void print(int n,String str) {
		for (int i = 1; i <=n; i++) {
			System.out.print(str);
		}
	}

}
