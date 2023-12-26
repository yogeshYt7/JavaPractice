package new_building;

public class ChegusCompqus {
	
		static void sum(String str)
		{
		int sum=0;
		String a=str;
		a=a.replaceAll("[a-z]","");
		String[] arr=a.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			int x=Integer.parseInt(arr[i]);
			sum+=x;
			
		}
	System.out.println(sum);
	}
	public static void main(String[] args) {
		sum("xy33z cd11e");
		sum("abc123xyz");
		sum("7 11");
	}

}
