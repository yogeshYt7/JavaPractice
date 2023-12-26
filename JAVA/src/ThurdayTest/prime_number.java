package ThurdayTest;

public class prime_number {
	public static void main(String[] args) {
		int start = 1000;
		int end = 9000;
		prime(start, end);
	}

	static void prime(int start, int end) {
		for (int i = start; i <= end; i++) {
			boolean flag = true;
			int n = i;
			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(n + "is a prime number");
			}
		}
	}
}