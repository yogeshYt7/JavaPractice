package TpyecastingA;

class Demo10
{
	double z=10.00;
	int r=70007;
}
class Dumtaka3 extends Demo10
{
	int x=7;
}
public class Mainclass12
{
	public static void main(String[] args) 
	{
		Demo10 d1= new Dumtaka3();
			System.out.println(d1.z);
			System.out.println(d1.r);
			
		
System.out.println("*****************************************");

			Dumtaka3 D= (Dumtaka3)d1;
			System.out.println(D.x);
			System.out.println(D.z);
			System.out.println(D.r);
			
	}
}
