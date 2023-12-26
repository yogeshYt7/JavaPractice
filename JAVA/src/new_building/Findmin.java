package new_building;

public class Findmin {
	public static void main(String[] args) {
		int[] arr={9,7,8,10,1,3,4,5,2,6};
		int FM=Integer.MAX_VALUE, SM=Integer.MAX_VALUE, TM=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<FM)
			{
				TM=SM;
				SM=FM;
				FM=arr[i];
			}
			else if(arr[i]<SM)
			{
				TM=SM;
				SM=arr[i];
			}
			else if(arr[i]<TM)
			{
				TM=arr[i];
			}
		}
		System.out.println(FM+" "+SM+" "+TM);
	}

}
