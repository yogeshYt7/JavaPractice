

public class Logic12 {
	static void printrange(int[] abb) {
		int sum = 0;
		for (int i = 0; i <= abb.length - 1; i++) {
			if (i % 2 == 1)
				sum = sum + (abb[i] * abb[i]);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		printrange(arr);
	}

}
