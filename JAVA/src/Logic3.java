

public class Logic3 {
	public static void main(String[] args) {
		String str="N7ikhl elli0diya3pp4A";
		System.out.println(str.replaceAll("[0-9]",""));
		
		String sts="Mari123 Kannu123 Hori123 Mele123";
		System.out.println(sts.replaceAll("123","@143"));
		
		String ab="mava1 athey2 rama3 pavan4";//mava9 athey9 rama9 pavan9
		System.out.println(ab.replaceAll("[0-9]","9"));
		
		String rp="mava1 athey2 rama3 pavan4";//m6v67 6they67 r6m67 p6v6n67
		rp=rp.replaceAll("a","6");
		System.out.println(rp.replaceAll("[1-4]","7"));//check
		
		String am="mava athey rama pavana";//java athey raja ravana
		am=am.replaceAll("m","j");
		System.out.println(am.replaceAll("p","r"));
	
		
		String al="mava athey rama pavan";
		System.out.println(al.replaceAll("a","@123"));
		
		String ap="ma@va! a#th$ey r&am*a p?av#an@a";
		System.out.println(ap.replaceAll("[@!#$*?&]",""));
	}
}
