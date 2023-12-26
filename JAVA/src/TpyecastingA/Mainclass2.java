package TpyecastingA;

class Sample
{
   void disp()
	{
		System.out.println("oye its a Disp ");
	}
}
class Ampules extends Sample
{
	void tata()
	{
		System.out.println("oye its a TATA");
	}
}
public class Mainclass2 
{
	public static void main(String[] args) 
	{
				Sample S= new Ampules();
				S.disp();
System.out.println("*****************************************");
			Ampules P= (Ampules)S;
				P.disp();
				P.tata();
			
	}
}
