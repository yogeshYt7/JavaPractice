package Programming1;

public class RomanNumbers {
	public static void main(String[] args) {
		String str="MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDDDDDDDDDDDDDDDDLXXXXXXXXXVVVV";
		char ch=' ';
		int sum = 0,i = 0,j=0;
		for (int  k = str.length()-1;k>=0; k--) 
		{
			ch=str.charAt(k);
		
		if (ch=='I') 
		{
			i=1;
		}  if (ch=='V') {
			i=5;
		}
		if (ch=='X') 
		{
			i=10;
		}if (ch=='L') 
		{
			i=50;
		}if (ch=='c') {
			i=100;
		} if (ch=='D') {
			i=500;
		} if (ch=='M') {
			i=1000;
		}
		 if (i >=j) 
		{
			sum=sum+i;
			j=i;
		} else if (j>i) {
			sum=sum-i;
			j=i;
		}
	}
		System.out.println(sum);
	}
}
