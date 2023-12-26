package mock;

public class ReverseRecursion {
	
public static void main(String[] args) {
	String str="java";
	char[] ch=str.toCharArray();
	int size=0;
	for(char c:ch) {
		size++;
	}
	reversestring(ch,size);
}

 static void reversestring(char[] ch, int size) 
 {
	 if(size>0) 
	 {
		 System.out.print(ch[size-1]);
		 size--;
		   reversestring(ch,size);

	 }
 }
}