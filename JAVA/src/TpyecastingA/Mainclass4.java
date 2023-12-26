package TpyecastingA;

class Cool
{
   void dispu()
	{
		System.out.println("     DISPU METHOD    ");
	}
}
class Goolata extends Cool
{
	void add()
	{    
		System.out.println("      ADD METHOD     ");
	}
}
public class Mainclass4 
{
	public static void main(String[] args) 
	{
		Cool S= new Goolata();
				S.dispu();
System.out.println("*****************************************");
                Goolata P= (Goolata)S;
				P.dispu();
				P.add();
			
			
	}
}
