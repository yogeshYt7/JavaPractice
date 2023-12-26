

public class PGMING {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 9, 2, 2 };
		Solution s1 = new Solution();
		int n = 5;
		int x = Solution.findMajority(arr, n);

	}
}

class Solution {
	static int findMajority(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > n / 2) {
				return arr[i];
			}
		}
		return -1;
	}
}