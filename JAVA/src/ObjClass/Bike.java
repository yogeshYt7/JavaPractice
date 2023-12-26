package ObjClass;

public class Bike {

		String bike_brand;
		double bike_cost;
		String bike_colour;
		Bike(String bike_brand,double bike_cost,String bike_colour)
		{
			this.bike_brand=bike_brand;
			this.bike_cost=bike_cost;
		    this.bike_colour=bike_colour;
		}
		public String toString()
		{
			return (this.bike_brand+" "+this.bike_cost +" "+this.bike_colour);
			
		}
		public static void main(String []args)
		{
			
			Bike S1=new Bike("RX100",4000000,"YELLOW");
			System.out.println(S1);
			Bike S2=new Bike("KTM",5000000,"ORANGE");
			System.out.println(S2);
			
		}
				
	}


