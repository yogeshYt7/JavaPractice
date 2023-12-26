package new_building;

public class Romantonum {
	public static void main(String[] args) {
		String str="IV";
		int sum=0, i=0, j=0;
		for (int j2 =str.length()-1; j2 >=0; j2--)
		{
			char ch=str.charAt(j2);
			if(ch=='I')
				i=1;
				if(ch=='V')
					i=5;
				if(ch=='X')
					i=10;
				if(ch=='L')
					i=50;
				if(ch=='C')
					i=100;
				if(ch=='D')
					i=500;
				if(ch=='M')
					i=1000;
				if(i>=j)
				{
					sum=sum+i;
					j=i;
				}
				else if(j>i)
				{
					sum=sum-i;
					j=i;
				}
		}
		System.out.println(sum);
		}
	}



