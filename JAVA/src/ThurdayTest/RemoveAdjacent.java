package ThurdayTest;

	/*
	 * input----->hi hi how how are are are you you 
	 * 
	 * output----->hi how are you
	 * 
	 * 
	 * i/p-----bengaluru bengaluru bengaluru is my city
	 * 0/p----bengaluru is my city
	 * 
	 * 
	 * 
	 * */
public class RemoveAdjacent {
		public static void main(String[] args) {
			
				String str="hi hi how how are are you you";
				String[] s1=str.split(" ");
				for (int i = 1; i < s1.length; i++) {
					if(s1[i]!=s1[i-1]) {
						System.out.print(s1[i]+" ");
						i++;
					}
				}
		}

}
