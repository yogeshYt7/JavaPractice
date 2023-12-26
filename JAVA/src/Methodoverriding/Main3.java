package Methodoverriding;

class Paytm1
{
	void payment()
	{
		
		System.out.println("pay with mobile number ");
	}
}
class Paytm2 extends Paytm1
{
	void payment()
	{
		super.payment();
		System.out.println("pay with scanner and pay request ");
	}
}
public class Main3 {
	public static void main(String[] args) {
		Paytm2 v = new Paytm2();
		v.payment();
	}

}
