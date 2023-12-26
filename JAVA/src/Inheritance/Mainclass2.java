package Inheritance;

class Sample1
{
	int x=10;
}
class Demo1 extends Sample1
{
	void disp()
	{
		System.out.println("...........HELLO................");
	}
}

class Tester extends Demo1
{
	void cool()
	{
		System.out.println(".................COOOL.........");
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		Tester S= new Tester();
		System.out.println(S.x);
		S.disp();
		S.cool();
	}

}
