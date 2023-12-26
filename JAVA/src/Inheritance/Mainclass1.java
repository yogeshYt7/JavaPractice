package Inheritance;

class Sample
{
	int x=10;
}
class Demo extends Sample
{
	void disp()
	{
		System.out.println("HELLO");
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		Demo S= new Demo();
		System.out.println(S.x);
		S.disp();
	}

}
