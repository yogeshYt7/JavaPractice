package Referencevariable;
class Jspider
{
   static void get(Knowledge k)
   {
	   k.learn();
   }
}

class Knowledge
{
   void learn()
   {
	   System.out.println("JSPIDER TRAIN THE STUDENT  AND GIVE KNOWLEDGE");
   }
}
public class Customer {
	public static void main(String[] args) {
		Knowledge K= new Knowledge();
		Jspider.get(K);
	}

}
