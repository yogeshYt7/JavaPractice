package ObjClass;

public class University {
	String course_name;
	String uni_name;
	int exam_cost;
	University(String course_name,String uni_name,int exam_cost)
	{
		this.course_name=course_name;
		this.uni_name=uni_name;
	    this.exam_cost=exam_cost;
	}
	public String toString()
	{
		return (this.course_name+" "+this.uni_name +" "+this.exam_cost);
		
	}
	public static void main(String []args)
	{
		University S1=new University("COMPUTER SCIENCE ","JNTUK",2500);
		System.out.println(S1);
		University S2=new University("CIVIL","JNTUK",2000);
		System.out.println(S2);
		
	}
			
}