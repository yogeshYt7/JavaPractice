package ObjClass;

public class Laptop {
	String laptop_name;
	double laptop_cost;
	String laptop_brand;
	Laptop(String laptop_name,double laptop_cost,String laptop_brand)
	{
		this.laptop_name=laptop_name;
		this.laptop_cost=laptop_cost;
	    this.laptop_brand=laptop_brand;
	}
	public String toString()
	{
		return (this.laptop_name+" "+this.laptop_cost +" "+this.laptop_brand);
		
	}
	public static void main(String []args)
	{
		
		Laptop S1=new Laptop("HP15S",4000000,"SILVER");
		System.out.println(S1);
		Laptop S2=new Laptop("DELL",5000000,"BLACK");
		System.out.println(S2);
		
		
	}
			
}