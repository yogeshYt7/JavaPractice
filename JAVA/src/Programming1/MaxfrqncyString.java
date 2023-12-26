package Programming1;

public class MaxfrqncyString {


		public static void main(String[] args) {

			String str=" TALARI YOGESWARA";
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
			    if(max<arr[str.charAt(i)])
			    {
			        max=arr[str.charAt(i)];
			        ch=str.charAt(i);
			    }
			}
			System.out.println(ch +" -->"+max);
		}

	}