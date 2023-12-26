package mock;

public class uniquechacter {

	public static void main(String[] args) {
		String str="java";
		for (int i = 0; i < str.length(); i++) {
			boolean flag=true;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)&& i!=j) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.print(str.charAt(i));
			}
		}

	}

}
