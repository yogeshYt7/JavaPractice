package new_building;//ip:hello java hi java how are you java, op:java->3

public class Logic5 {
	public static void main(String[] args) {
		String str="hello java hi java how are you java";
		String[] s1=str.split(" ");
		String k="java";
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals(k))
			{
				count++;
			}
		}
		System.out.println(k+"->"+count);
	}
}
