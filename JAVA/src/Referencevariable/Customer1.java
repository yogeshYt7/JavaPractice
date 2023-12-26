package Referencevariable;

class Swiggy
{
	static void getfood(Hotel H2)
	{
		H2.food();
	}
}
class Hotel
{
 	void food()
 	{
 		System.out.println("CHIKEN FRY");
 	}
}
public class Customer1{
	public static void main(String[] args) {
		Hotel H1= new Hotel();
		Swiggy.getfood(H1);
	}

}
