package new_building;

public class Randomiologic {
	public static void main(String[] args) {
		String s1="2a4b1c";
		char[] arr=s1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='2')
			{
				System.out.print("aa");
			}
			else if (arr[i]=='4') 
			{
				System.out.print("bbbb");
			}
			else if (arr[i]=='1')
			{
				System.out.print("c");
			}
		}
	}

}
