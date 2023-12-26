package ThurdayTest;

public class programcheck {
	static void removeduplicates(String str)
	{
		for (int i = 0; i < str.length(); i++) {
			boolean flag=true;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)&&i!=j) {
					flag=false;
					break;
				}
				if(flag) {
					System.out.print(str.charAt(i));
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		String str1="Bengaluru";
		String str2="karnataka";
		String str3="";
		for(int i=0;i<str1.length();i++) {
			if(str2.charAt(i)=='k'||str2.charAt(i)=='t') {
				str3=str3+str2.charAt(i);
				
			}
			removeduplicates(str3);
		}
	}

}
