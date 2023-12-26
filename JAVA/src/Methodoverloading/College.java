package Methodoverloading;
class Student
{
void std(String name)
{
System.out.println("student name is "+ name);	
}
void std(int id )
{
System.out.println("student id is "+ id);	
}

void std(double percentage)
{
System.out.println("percentage in graduation "+ percentage );	
}
void std(boolean  branch)
{
System.out.println("student belongs to "+ branch);	
}
}
public class College {
	public static void main(String[] args) {
		Student D=new Student();
		D.std("ABHIGNA");
		D.std(581);
		D.std(90.12);
		D.std("cse");
				
	}

}
