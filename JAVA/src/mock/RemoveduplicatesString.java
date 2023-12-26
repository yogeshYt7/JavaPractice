package mock;

public class RemoveduplicatesString {

	public static void main(String[] args) {
		String str="aabccdd";
		for (int i = 0; i < str.length(); i++) {
			boolean flag=true;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)&& i!=j) {
					flag=false;
					break;
				}
			}
			if(flag) {
				char n=str.charAt(i);
				char n1=n;
				System.out.println(n1);
			}
		}

	}

}
