package new_building;

import java.util.Arrays;

public class Comparable_concept {
	public static void main(String[] args) {
		Employee e1=new Employee(10,"Ompreeth",5599);
		Employee e2=new Employee(1,"Umesh",5999);
		Employee e3=new Employee(3,"Chanduuu",3213);
		Employee[] arr={e1,e2,e3};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
class Employee implements Comparable
{
	int id;
	String name;
	int salary;
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
	public int compareTo(Object obj)
	{
		Employee a=(Employee) obj;
		return this.id-a.id;
	}
}
