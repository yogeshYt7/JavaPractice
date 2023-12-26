package ObjClass;

public class Mobile {
		String mob_name;
		int mob_cost;
		String mob_colour;
		Mobile(String mob_name,int mob_cost,String mob_colour)
		{
			this.mob_name=mob_name;
			this.mob_cost=mob_cost;
		    this.mob_colour=mob_colour;
		}
		public String toString()
		{
			return (this.mob_name+" "+this.mob_cost +" "+this.mob_colour);
			
		}
		public static void main(String []args)
		{
			
			Mobile S1=new Mobile("REAL ME",200000,"BLUE");
			System.out.println(S1);//System.out.println(S1.toString());
			Mobile S2=new Mobile("SAMSUNG",600000,"SLIVER");
			System.out.println(S2);
						
		}
				
	}