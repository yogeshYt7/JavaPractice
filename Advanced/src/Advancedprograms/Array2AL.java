package Advancedprograms;

import java.util.ArrayList;
import java.util.List;

public class Array2AL {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Object [] abb=copyToobjectArray(arr);
		List L2 = convert(arr);
		System.out.println(L2);
	}

	static Object[] copyToobjectArray(int[] arr) {
		Object[] abb= new Object[arr.length];
		for (int i = 0; i < arr.length; i++) {
			abb[i]=arr[i];
		}
		return abb;
	}

	public static List convert(int[] arr) {
		List L1 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			L1.add(arr[i]);
		}
		return L1;
	}
}
