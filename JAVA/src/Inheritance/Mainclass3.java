package Inheritance;
class Sample2
{
	int x=10;
}
class Demo2 extends Sample2
{
	void disp()
	{
		System.out.println("...........HELLO................");
	}
}

class Tester1 extends Sample2
{
	void cool()
	{
		System.out.println(".................COOOL.........");
	}
}
public class Mainclass3 {
	public static void main(String[] args)
	{
	System.out.println(".................I AM DEMO 2.........");
		Demo2 D=new Demo2();
		System.out.println(D.x);
		D.disp();
   System.out.println(".................I AM TESTER 1.........");
		Tester1 S= new Tester1();
		System.out.println(S.x);
		S.cool();
	}

}

