package Programming1;
//O/P:- I LOVE MY INDIA 
// O/P:- A IDNI YM EVOLI 

public class CharString {

		static int countingchar(String s1,char search) {
			int charcount=0;
			char [] arr=s1.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				if (search == arr[i]) {
					charcount++;
					System.out.println(charcount);
				}
			}
			return charcount;
		}
			public static void main(String[] args) {
			String str =" I LOVE MY INDIA ";//A IDNI YM EVOLI 
			char[]abb=str.toCharArray();
			String []arr=new String[countingchar(str,' ')+1];
			String rev="";
			int wordcount=0;//counter for the word index in the arr Array
			
			for (int i =0;i<abb.length; i++) 
			{
				
				if (abb[i]!=' ') 
				{
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
