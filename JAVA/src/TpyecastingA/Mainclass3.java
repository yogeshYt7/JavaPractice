package TpyecastingA;

class Tester 
{
	int r=7816;
}
class Tista extends Tester
{
	void uliya()
	{
		System.out.println("oye its a ULIYA ");
	}
}
public class Mainclass3
{
	public static void main(String[] args) 
	{
		Tester d= new Tista();
			System.out.println(d.r);
 System.out.println("*****************************************");
			Tista p=  (Tista)d;
			System.out.println(p.r);
				p.uliya();
			
	}
}
