package mock;

public class bubblesort {

	public static void main(String[] args) {
		int[] arr= {13,1,5,4,3,2};
		bubblesort(arr);
	}

	 static void bubblesort(int[] arr) {
		 for (int i = 0; i < arr.length; i++) {
			 for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}	
		}
		 for (int k = 0; k< arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

}
