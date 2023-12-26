package Methodoverriding;

class Whatsappv1
{
	void status()
	{
		
		System.out.println("Status with text ");
	}
}
class Whatsappv2 extends Whatsappv1
{
	void status()
	{
		
		System.out.println("Status with TEXT + IMAGES ");
	}
}
public class Main1 {
	public static void main(String[] args) {
		Whatsappv2 v = new Whatsappv2();
		v.status();
	}

}
