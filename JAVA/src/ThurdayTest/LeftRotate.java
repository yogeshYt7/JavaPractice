package ThurdayTest;

public class LeftRotate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i < n - k) {
                System.out.print(arr[i + k] + " ");
            } else {
                System.out.print(arr[i + k - n] + " ");
            }
        }
    }
}

