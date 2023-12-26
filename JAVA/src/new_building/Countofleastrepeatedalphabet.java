package new_building;

public class Countofleastrepeatedalphabet {
	public static void main(String[] args) {
		String str="hello";
		int[] arr=new int[122];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			arr[ch]++;
		}
		int min=100;
		char ch=' ';
		for(int i=0;i<str.length();i++)
		{
			if(min>arr[str.charAt(i)])    
			{							
				min=arr[str.charAt(i)];
				ch=str.charAt(i);
			}
		}
		System.out.println(ch+"->"+min);
	}

}


