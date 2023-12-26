package new_building;
import java.util.Collections;
import java.util.Stack;

public class Bubblesortusingstack {
	public static void sortStack(Stack <Integer> stack)
	{
	
		Collections.sort(stack);
		System.out.println(stack);
	}
	public static void main(String[] args) {
		Stack <Integer> s1=new <Integer> Stack();
		s1.push(4);
		s1.push(1);
		s1.push(3);
		s1.push(5);
		sortStack(s1);
		Stack <Integer> s2=new <Integer> Stack();
		int[] arr={7,8,9,1,2};
		for (int i = 0; i < arr.length; i++) {
			s2.push(arr[i]);
		}
		sortStack(s2);
	}

}
