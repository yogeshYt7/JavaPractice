package new_building;//check

public class Logic4a {

	static int number(String a) {

		int no = Integer.parseInt(a);
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int x = number("1234");
		System.out.println(x);

	}
}
