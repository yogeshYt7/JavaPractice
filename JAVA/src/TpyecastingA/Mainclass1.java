package TpyecastingA;

class Demo
{
	int x=10;
}
class Pemocha extends Demo
{
	void ho()
	{
		System.out.println("oye its a hoo ");
	}
}
public class Mainclass1 
{
	public static void main(String[] args) 
	{
			Demo d= new Pemocha();
			System.out.println(d.x);
			System.out.println("*****************************************");
			Pemocha p=  (Pemocha)d;
			System.out.println(p.x);
				p.ho();
			
	}
}
