package Referencevariable;
class Bookmyshow
{
	 static void book(Theatre v)
	 {
		 v.booking();
	 }
}
class Theatre
{
	 void booking()
	 {
		 System.out.println("ticket confired");
	 }
}
public class Audience {
	public static void main(String[] args) {
		Theatre V = new Theatre();
		Bookmyshow.book(V);
	}

}
