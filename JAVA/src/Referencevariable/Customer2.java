package Referencevariable;
 class Wipro
 {
	 static void getsal(Salary S1)
	 {
		 S1.sal();
	 }
 }
 class Salary
 {
	 void sal()
	 {
		 System.out.println("WIPRO PROVIDE SALARY TO EMPLOYEES");
	 }
 }
public class Customer2 {
	public static void main(String[] args) {
		Salary S = new Salary();
		Wipro.getsal(S);
	}

}
