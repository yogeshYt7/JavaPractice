package Methodoverriding;

class Ola_v1
{
	void ride()
	{
		
		System.out.println("ride with bike ");
	}
}
class Ola_v2 extends Ola_v1
{
	void ride()
	{
		super.ride();
		System.out.println(" ride with auto ");
	}
}
public class Main4 {
	public static void main(String[] args) {
		Ola_v2 v = new Ola_v2();
		v.ride();
	}

}
