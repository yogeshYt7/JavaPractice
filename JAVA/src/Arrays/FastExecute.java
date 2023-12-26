package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FastExecute {

	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<Integer>();
		List<Integer> l1 = new LinkedList<Integer>();
		getTimeDifference(a1);
		getTimeDifference(l1);

	}

	static void getTimeDifference(List<Integer> l1) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			l1.add(0, i);
		}
		long end = System.currentTimeMillis();
		System.out.println(l1.getClass().getName() + "--->" + (end - start));
	}

}
