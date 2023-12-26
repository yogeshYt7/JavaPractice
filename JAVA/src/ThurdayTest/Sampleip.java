package ThurdayTest;

public class Sampleip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		int n=4;
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char ch1=(char)(ch[i]+n);
			System.out.print(ch1);
		}
	}

}
