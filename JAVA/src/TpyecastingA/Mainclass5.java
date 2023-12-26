package TpyecastingA;

class Demo1
{
	double z=10.00;
}
class Dumtaka extends Demo1
{
	int x=7;
}
public class Mainclass5
{
	public static void main(String[] args) 
	{
		Demo1 d1= new Dumtaka();
			System.out.println(d1.z);
			
			
		
System.out.println("*****************************************");

			Dumtaka D= (Dumtaka)d1;
			System.out.println(D.x);
			System.out.println(D.z);
			
	}
}
