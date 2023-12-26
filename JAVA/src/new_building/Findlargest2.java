package new_building;

public class Findlargest2 {
	public static void main(String[] args) {
		int[] arr={9,7,8,10,1,3,4,5,2,6};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(arr[arr.length-1]+" "+arr[arr.length-2]+" "+arr[arr.length-3]);
	}

}
