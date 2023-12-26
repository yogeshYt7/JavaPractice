package Advancedprograms;

import java.util.ArrayList;
import java.util.List;

public class AL2List {
	public static void main(String[] args) {
		Double[] arr = { 1.2, 2.25, 3.0, 4.58, 6.12 };
		Object [] abb=copyToobjectArray(arr);
		List L2 = convert(arr);
		System.out.println(L2);
	}

	static Object[] copyToobjectArray(Double[] arr) {
		Object[] abb= new Object[arr.length];
		for (int i = 0; i < arr.length; i++) {
			abb[i]=arr[i];
		}
		return abb;
	}

	public static List convert(Double[] arr) {	
		List L1 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			L1.add(arr[i]);
		}
		return L1;
	}
}
