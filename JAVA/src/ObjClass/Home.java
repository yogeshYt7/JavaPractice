package ObjClass;

public class Home {
	String home_name;
	double home_cost;
	String home_colour;
	Home(String home_name,double home_cost,String home_colour)
	{
		this.home_name=home_name;
		this.home_cost=home_cost;
	    this.home_colour=home_colour;
	}
	public String toString()
	{
		return (this.home_name+" "+this.home_cost +" "+this.home_colour);
		
	}
	public static void main(String []args)
	{
		Home S1=new Home("FEEL GOOD HOMES",2000000,"SKY BLUE");
		System.out.println(S1);
		Home S2=new Home("HELL AND HEAVEN",2000000,"WHITE");
		System.out.println(S2);
		
	}
			
}