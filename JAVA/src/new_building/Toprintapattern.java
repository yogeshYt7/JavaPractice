package new_building;

public class Toprintapattern {
	static void disp(String str,String key)
	{
		String[] arr=str.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(key))
			{
				count++;
			}
		}
		System.out.println(key+"->"+count);	
	}
	public static void main(String[] args) {
		disp("is the java is easy yes it is","is");
	}

}
