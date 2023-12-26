package ObjClass;

public class School {
	String school_name;
	char school_grade;
	String school_strength;
	School(String school_name,char school_grade,String school_strength)
	{
		this.school_name=school_name;
		this.school_grade=school_grade;
	    this.school_strength=school_strength;
	}
	public String toString()
	{
		return (this.school_name+" "+this.school_grade +" "+this.school_strength);
		
	}
	public static void main(String []args)
	{
		
		School S1=new School("SVR SCHOOL",'B',"2500");
		System.out.println(S1);
		School S2=new School("SMJC SCHOOL",'A',"2000");
		System.out.println(S2);
		
	}
			
}