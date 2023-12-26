package Abstract;

abstract class Sample
{
	abstract void disp();
	abstract void test();
}
class Demo extends Sample
{
	void disp()
	{
		System.out.println("hello");
	}
	void test()
	{
		System.out.println("BYE");
	}
}
public class Mainclass {
	public static void main(String[] args) {
		
	Demo D= new Demo();
	D.disp();
	D.test();
	}

}
