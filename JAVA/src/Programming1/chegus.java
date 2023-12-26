
package Programming1;
import java.util.Scanner;
public class chegus {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String str=s1.next();
		sum(str);
		//String str1="xy33z cd11e";
		//sum(str1);
		//String str2="abd123xyz";
		//sum(str2);
		//String str3="7 11";
		//sum(str3);
	}
	static void sum(String str)
	{
		
		String str1=str.replaceAll("[a-z]","");
		String[] arr=str1.split(" ");
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int n=Integer.parseInt(arr[i]);
			sum=sum+n;
		}
		System.out.println(sum);
			}
}
