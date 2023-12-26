package new_building;
import java.util.Stack;

public class Logiconstack {
	static boolean valid(String str)
	{
		Stack <Character> s1=new <Character> Stack();
		for(char ch:str.toCharArray())
		{
			if(ch=='(')
			{
				s1.push(')');
			}
			else if(ch=='[')
			{
				s1.push(']');
			}
			else if(ch=='{')
			{
				s1.push('}');
		
			}
			else if(s1.isEmpty()||s1.pop()!=ch)
			{
				return false;
			}
		}
		return s1.isEmpty();
	}
public static void main(String[] args) {
	String str="([{)";
	
	if(valid(str))
	{
		System.out.println("Balanced");
	}
	else
	{
		System.out.println("Not Balanced");
	}
}
}
