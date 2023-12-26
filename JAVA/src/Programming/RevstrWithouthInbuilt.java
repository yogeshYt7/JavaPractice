package Programming;
public class RevstrWithouthInbuilt {
	static int countingchar(String s1,char search) {
		int charcount=0;
		char [] arr=s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				charcount++;
			}
		}
		return charcount;
	}
	
	public static void main(String[] args) 
	 {
		String str ="hello java how are you ";
		char[]abb=str.toCharArray();
	
		String []arr=new String[countingchar(str,' ')+1];
		String rev="";
		int wordcount=0;//counter for the word index in the arr Array
		
		for (int i =0;i<abb.length; i++) 
		{
			if (abb[i]!=' ') {
				rev = rev+abb[i];
			}else {
				arr[wordcount]=rev;
				rev ="";
				wordcount++;
			}
		}
		arr[wordcount]=rev;
		for (int i= arr.length-1;i>=0; i--) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
