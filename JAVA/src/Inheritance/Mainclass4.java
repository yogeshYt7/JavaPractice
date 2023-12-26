package Inheritance;
class Grandfather
{
	String x="GRANFATHER";
}
class father extends Grandfather
{
	void disp()
	{
		System.out.println("FATHER");
	}
}

class Son extends father
{
	void cool()
	{
		System.out.println("SON");
	}
}
class Daughter extends father
	{
		void hot()
		{
			System.out.println("DAUGHTER");
		}
}
public class Mainclass4 {
	public static void main(String[] args)
	{
	System.out.println(".........................");
		Son D=new Son();
		System.out.println(D.x);
			D.cool();
			D.disp();
   System.out.println(".........................");
   		Daughter S= new Daughter();
		System.out.println(S.x);
			S.disp();
			S.hot();
	}
}

 