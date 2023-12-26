package Programming;
import java.util.Stack;
public class Stackpgm1 {
	public static void main(String[] args) {
		String str="{[()]}";
		if (valid(str)) 
		{
			System.out.println("Balanced");
		}else {
			System.out.println("Unbalanced");
		}
	}
	 static boolean valid(String str)
	 {
		 Stack<Character> s1= new Stack<Character>();
		 for (Character ch : str.toCharArray()) 
		 {
			 if (ch=='(') 
			 {
				s1.push(')');
			 }else if (ch=='{') 
			 {
				s1.push('}');
			 }else if (ch=='[') 
			 {
				s1.push(']');
			 }else if (s1.isEmpty()||s1.pop()!=ch)
			 {
				return false;
			 }			
	   	}
				return s1.isEmpty();
	 }

}
