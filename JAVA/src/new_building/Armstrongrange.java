package new_building;

public class Armstrongrange {
	static void findarm(int no,int a)
	{
		
		for (int i = no; i<=a; i++) {
			int no2=i;
			int no1=i;
			int copy=i;
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
		}
	
	public static void main(String[] args) {
		
			findarm(1000,5000);
		
	}

}
