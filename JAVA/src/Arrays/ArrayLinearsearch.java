package Arrays;

public class ArrayLinearsearch {
	public static void main(String[] args) {
		int [] arr= {4,1,3,5,2,8,6,7};
		int k=2;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]==k)
			{
				System.out.println(k+" is in the "+i+" index");
			}
		}
	}

}
