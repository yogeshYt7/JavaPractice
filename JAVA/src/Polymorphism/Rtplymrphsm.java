package Polymorphism;

class Animal
{
   void noise()
   {
	   System.out.println(" some noise");
   }
}
 class Dog extends Animal
 {
	 void noise()
	 {
		 System.out.println("BOW BOW");
	 }
 }
 class Cat extends Animal
 {
	 void noise()
	 {
		 System.out.println("meow meow ");
	 }
 }
 class Snake extends Animal
 {
	 void noise()
	 {
		 System.out.println("USUS ussss....");
	 }
 }

 class Polymorphism
 {
	 static  void  morphism(Animal a1)
	 {
		 a1.noise();
	 }
 }
public class Rtplymrphsm {
	public static void main(String[] args) {
		Dog D1=new Dog();
		Cat C1=new Cat();
		Snake S1=new Snake();
		
		Polymorphism.morphism(D1);
		Polymorphism.morphism(C1);
		Polymorphism.morphism(S1);
			
	}

}
