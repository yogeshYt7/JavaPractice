package Presentation;

public class PGM2 {
	public static void main(String[] args) {
		int[] arr = { 8, 6, 3, 9, 5, 1, 7, 4, 2, 10 };
		int evensum = 0;
		int oddsum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evensum += arr[i];
			} else if (arr[i] % 2 == 1) {
				oddsum += arr[i];

			}
		}
		System.out.println(evensum*oddsum);
	}
}
