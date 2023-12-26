package Testquestions;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        int k1 = 1;
        int k2 = 5;

        int kthSmallest = kthSmall(arr, k1);
        int kthLargest = kthLarge(arr, k2);

        System.out.println("The " + k1 + "th smallest element is: " + kthSmallest);
        System.out.println("The " + k2 + "th largest element is: " + kthLargest);
    }

    public static int kthSmall(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        return arr.get(k - 1);
    }

    public static int kthLarge(ArrayList<Integer> arr, int k) {
        Collections.sort(arr, Collections.reverseOrder());
        return arr.get(k - 1);
    }
}
