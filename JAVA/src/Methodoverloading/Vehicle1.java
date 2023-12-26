package Methodoverloading;

class Car1 {
		static void Car( String name )
		{
			System.out.println("vehicle name is "+ name);
		} 
		static void Car( int plate_no)
		{
			System.out.println("Vehicle number is "+ plate_no);
		}
		static void Car( int Price,String Colour)
		{
			System.out.println("vehicle cost is "+ Price);
			System.out.println("Vehicle colour is "+ Colour);
		}
	 }
	public class Vehicle1{
		public static void main(String[] args) {
			Car1.Car("ROLLS ROYCE");
			Car1.Car(00007);
			Car1.Car(10000000,"BLACK");
			}
		}

