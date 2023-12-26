package Programming;


class Reverse
{
		static void rs(String[] str)
		{
			String b = " ";
			for (int i=0; i< str.length; i++) 
			{ 
				for (int j = i; j >=0; j--) {
					b= b+str[j].charAt(j);
					
				}	
			}
			System.out.println(b);
			
		}
	
}
public class Reversestring2 {
	public static void main(String[] args) {
		String [] str={"KEDHARANATH","AMARNATH","BHADRNATH","DAWARAKH","BRINDHAVAN","KASHI"};
		Reverse.rs(str);
	}

}
