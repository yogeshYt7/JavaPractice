package new_building;
import java.util.TreeSet;
public class Switchcasediffcases {
	static void arm()
	{
		int no2=153;
		int no1=153;
		int copy=153;
		int count=0;
		double sum=0;
			
		while(no1!=0)
		{
			no1=no1/10;
			count++;
		}
		while(no2!=0)
		{
			int rem=no2%10;
			sum+=Math.pow(rem, count);
			no2=no2/10;
		}
		
	
		if(copy==sum){
			System.out.println(copy+" is an armstrong number");
		}
	}
	static void per()
	{
		int no=14;
		int sum=0;
		int copy=no;
		for(int i=0;i<no/2;i++)
		{
			if(no%i==0)
			{
				sum+=i;
			}
		}
		if(sum==copy)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not a Perfect number");
		}
		
	}
	static void pan()
	{
		String s1="The Quick Brown Fox Jumps Over The Lazy Dog";
		s1=s1.toLowerCase();
		TreeSet t1=new TreeSet();
		t1.add(s1);
		if(t1.size()==26)
		{
			System.out.println("Panagram");
		}
	}
	static void nextvowel()
	{
		char ch='f';
		if(ch>='a'&&ch<='e')
		{
			System.out.println('e');
		}
		else if(ch>='e'&&ch<='i')
		{
			System.out.println('i');
		}
		else if(ch>='i'&&ch<='o')
		{
			System.out.println('o');
		}
		else if(ch>='o'&&ch<='u')
		{
			System.out.println('u');
		}
		else
		{
			System.out.println('a');
		}
	}
	public static void main(String[] args) {
		int i=1;
		switch(i){
		case 1:arm();
		break;
		case 2:per();
		break;
		case 3:pan();
		break;
		case 4:nextvowel();
		break;
		default: System.out.println("Invalid input");
		break;
	}
		}
	}
	
	


