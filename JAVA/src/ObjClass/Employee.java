package ObjClass;

public class Employee {
	int emp_id;
	char emp_grade;
	double emp_sal;
	Employee(int emp_id,char emp_grade,double emp_sal)
	{
		this.emp_id=emp_id;
		this.emp_grade=emp_grade;
	    this.emp_sal=emp_sal;

	}
	public String toString()
	{
		return (this.emp_id+" "+this.emp_grade +" "+this.emp_sal);
		
	}
	public static void main(String []args)
	{
		Employee S1=new Employee(102,'A',250);
		System.out.println(S1);
		Employee S2=new Employee(125,'B',150);
		System.out.println(S2);
	
	}
			
}