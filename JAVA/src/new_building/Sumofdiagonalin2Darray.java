package new_building;

public class Sumofdiagonalin2Darray {
	public static void main(String[] args) {
		int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i][i];
		}
		System.out.println(sum);
	}
}
