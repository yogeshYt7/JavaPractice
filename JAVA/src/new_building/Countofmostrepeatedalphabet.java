package new_building;

public class Countofmostrepeatedalphabet {
	public static void main(String[] args) {
		String str="hello";
		int[] arr=new int[122];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			arr[ch]++;
		}
		int max=-1;
		char ch=' ';
		for(int i=0;i<str.length();i++)
		{
			if(max<arr[str.charAt(i)])    /* if(arr[i]!=0)
												{
													if(max<arr[i])
													{max=arr[i];
													ch=str.charAt(i);
													}
												} */
			{							
				max=arr[str.charAt(i)];
				ch=str.charAt(i);
			}
		}
		System.out.println(ch+"->"+max);
	}

}
