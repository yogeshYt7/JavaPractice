package ThurdayTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _11102023PGMS {

	public static void main(String[] args) {
        
		ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
        int k=1;
		System.out.println(kthSmallLarge(a1,a1.size(),k));
          
		
	}
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr,int n,int k)
	{
		Collections.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr.get(k-1));
        ans.add(arr.get(n-1));
		return ans;

		
		
	}
}
