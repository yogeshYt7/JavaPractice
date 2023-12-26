package new_building;

public class PrintVowelsnconsonants {
	public static void main(String[] args) {
		String str="india";
		String vowels="";
		String consonants="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels+=ch;
			}
			else
			{
				consonants+=ch;
			}
		}
		System.out.println(consonants+" "+vowels);
	}

}
