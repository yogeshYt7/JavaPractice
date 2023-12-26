package Methodoverloading;
class Sample
{
void data(int a)
{
System.out.println(a +"is intger datatype ");	
}
void data(String a)
{
System.out.println(a +" is String  datatype ");	
}
void data(long a)
{
System.out.println(a +" is long datatype ");	
}
void data(double a)
{
System.out.println(a +" is double datatype ");	
}
}
public class Datatypes {
	public static void main(String[] args) {
		Sample D= new Sample();
		 D.data(12555);
		 D.data("SHANKAR ANNA");
		 D.data(7816942222L);
		 D.data("true");
	}

}
