


public class Logic5 {
	static void reverse(String[] arr)
	{
		 
		for(int i=0;i<arr.length;i++)
		{
			String reverse="";
			for(int a=arr[i].length()-1;a>=0;a--){
			reverse=reverse+arr[i].charAt(a);
			}
			System.out.print(reverse+" ");
		}
		
			
	}

	public static void main(String[] args) {
		String[] arr={"Kedarnath","Amarnath","Bhadrinath","Brindhavan","Dwarakh","Kashi"};
		reverse(arr);
	}

}
