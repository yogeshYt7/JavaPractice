package Programming;
import java.util.Collections;
import java.util.Stack;
public class Collectionsort {
	public static void sortstack(Stack<Integer>stack)
	{
		Collections.sort(stack);
		System.out.println(stack);
	}
	public static void main(String[] args) {
	 Stack <Integer> S= new Stack<Integer>(); 
	     S.push(4);
	     S.push(1);
	     S.push(3);
	     S.push(5);
		sortstack(S);
	}

}
