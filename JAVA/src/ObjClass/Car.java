package ObjClass;

public class Car {
	String car_name;
	double car_cost;
	String car_colour;
	Car(String car_name,double car_cost,String car_colour)
	{
		this.car_name=car_name;
		this.car_cost=car_cost;
	    this.car_colour=car_colour;
	}
	public String toString()
	{
		return (this.car_name+" "+this.car_cost +" "+this.car_colour);
		
	}
	public static void main(String []args)
	{		
		Car S1=new Car("BENZ",200000000,"BLUE");
		System.out.println(S1);
		Car S2=new Car("ROLLS ROYCE",2000000000,"SLIVER");
		System.out.println(S2);
		
	}
			
}