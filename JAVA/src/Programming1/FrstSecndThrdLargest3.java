package Programming1;
public class FrstSecndThrdLargest3 {
	public static void main(String[] args) 
	{
		int []arr= {9,7,8,10,4,3,5,2,6,1};
		int fl=0;
		int sl=0;
		int tl=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]>fl)
			{
				tl=sl;   
				sl=fl;
				fl=arr[i];				
			}
			else if(arr[i]>sl)
			{
				tl=sl;
				sl=arr[i];
			}
			else if(arr[i]>tl)
			{
				tl=arr[i];
			}
		}
	System.out.println(fl+" "+ sl+" "+tl);
	}

}
