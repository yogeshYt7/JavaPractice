package new_building;

public class Accenturecoding {
	public static void main(String[] args) {
		int[] arr={3,8,14,12,10,7,4};
		int sum1=0;
		int sum2=0;
		for(int i=arr.length/2-1;i>=0;i--)
		{
			sum1=sum1+arr[i];
		}
		for(int i=arr.length/2-1;i<arr.length;i++)
		{
			sum2=sum2+arr[i];
		}
		int mul=sum1*sum2;
		System.out.println(mul);
	}
	

}
