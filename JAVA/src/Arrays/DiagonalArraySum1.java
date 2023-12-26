package Arrays;

public class DiagonalArraySum1 {
	public static void main(String[] args) {
		int [][]arr= {{23,2,3,4},{5,15,7,8},{9,15,21,12},{13,14,19,16}};
		int sum1=0;
		int sum2=0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum1+=arr[i][i];//diagonal sum 
			sum2+=arr[i][arr.length-i-1];//Anti DiagonalSum ;
		}
		System.out.println("Diagonal sum is "+sum1);
		System.out.println("Anti DiagonalSum is "+sum2);
		System.out.println(sum1-sum2);
	}

}
