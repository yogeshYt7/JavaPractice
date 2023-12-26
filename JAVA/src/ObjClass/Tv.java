package ObjClass;

public class Tv {
		String tv_brand;
		double tv_cost;
		String tv_type;
		Tv(String tv_brand,double tv_cost,String tv_type)
		{
			this.tv_brand=tv_brand;
			this.tv_cost=tv_cost;
		    this.tv_type=tv_type;
		}
		public String toString()
		{
			return (this.tv_brand+" "+this.tv_cost +" "+this.tv_type);
			
		}
		public static void main(String []args)
		{
			
			Tv S1=new Tv("SAMSUNG",4000000,"LCD");
			System.out.println(S1);
			Tv S2=new Tv("SONY",5000000,"SMART");
			System.out.println(S2);
			
			
		}
				
	}