package new_building;

public class Findlargestwithoutsorting {
	public static void main(String[] args) {
		int[] arr={9,7,8,10,1,3,4,5,2,6};
		int FL=0, SL=0, TL=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>FL)
			{
				TL=SL;
				SL=FL;
				FL=arr[i];
			}
			else if(arr[i]>SL)
			{
				TL=SL;
				SL=arr[i];
			}
			else if(arr[i]>TL)
			{
				TL=arr[i];
			}
		}
		System.out.println(FL+" "+SL+" "+TL);
	}

}
