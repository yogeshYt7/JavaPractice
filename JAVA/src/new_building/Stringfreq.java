package new_building;

public class Stringfreq {
	public static void main(String[] args) {
		String str="abbababa";
		int[] arr=new int[122];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
			{
				System.out.println((char) i+"-> "+arr[i]);
			}
		}
	}

}
