package Abstract;

abstract class Demo1
{
	abstract void disp();
	abstract void test();
}
abstract class Sample1 extends Demo1
{
	void disp()
	{
		System.out.println("hello");
	}
	//abstract void test();
}
class Tester extends Sample1
{
	//void disp()
	void test()
	{
		System.out.println("hello");
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		
	Tester T= new Tester();
	T.disp();
	T.test();
	}

}