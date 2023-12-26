package new_building;

public class Swap1stnlastletterofeachwordinasentence {
	public static void main(String[] args) {
		
		String str="java is easy";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length && ch[i]!=' ')
			{	
				i++;
			}
				char temp=ch[k];
				ch[k]=ch[i-1];
				ch[i-1]=temp;
	}
		System.out.println(ch);
	}
}


