package logicswithShankarsir;

public class Rotarray1 {
	public static void main(String[] args) {
		
	int[] arr={1,2,3,4,5,6,7,8,9};
	int k=10;
	int n=arr.length;
	k=k%n;
	for(int i=0;i<n;i++)
	{
		if(i<k){
		System.out.print(arr[n+i-k]+" ");
		}
		else{
		System.out.print(arr[i-k]+" ");
		}
	}
  }
}