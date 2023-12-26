package TpyecastingA;

class Cool4
{
   void add()
	{
		System.out.println("   ADD METHOD       ");
	}
}
class Goolata2 extends Cool4
{ int r;
	void dispu()
	{    
		System.out.println("   DISPU METHOD    ");
	}
}
public class Mainclass11 
{
	public static void main(String[] args) 
	{
		Cool4 S= new Goolata2();
				S.add();
System.out.println("*****************************************");
                Goolata2 P= (Goolata2)S;
                System.out.println(P.r);
				P.dispu();
				P.add();
			
			
	}
}
