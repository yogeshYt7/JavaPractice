package ThurdayTest;

public class Bubblesort {

	public static void main(String[] args) {
		int[] arr= {4,6,1,9,7,10,11};
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
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
