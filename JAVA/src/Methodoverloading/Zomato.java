package Methodoverloading;

 class Demo{
	static void Order( String food)
	{
		System.out.println("Food item is "+ food);
	}
	static void Order( int price)
	{
		System.out.println("Food item is "+ price);
	}
	static void Order( int quantity,String size)
	{
		System.out.println("Food quantity is "+ quantity);
		System.out.println("pack size is "+ size);
	}
 }
class Zomato{
	public static void main(String[] args) {
		Demo.Order("SAMOSA");
		Demo.Order(1500);
		Demo.Order(6,"family pack");
		}
	}
