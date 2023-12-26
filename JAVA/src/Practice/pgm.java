package Practice;

public class pgm {
public static void main(String[] args) {
	String str="abc123#*@dfe";
	str=str.replaceAll("[0-9~!@#$%^&*()]","");
	System.out.println(str);
	str=str.toUpperCase();
	System.out.println(str);
}
}
