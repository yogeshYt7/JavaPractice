package Arrays;

public class Arrays1 {
	public static void main(String[] args) {
		String K="JAVA";
		String Str="HELLO JAVA HII JAVA HOW ARE YOU JAVA";
		String [] S1= Str.split(" ");
		int count =0;
		for (int i = 0; i < S1.length; i++) {
			 if (S1[i].equals(K))
			 {
				 count++;
			 }
			
		}
		System.out.println(K +" --> "+ count);
		
	}

}
