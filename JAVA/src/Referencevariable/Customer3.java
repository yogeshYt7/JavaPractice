package Referencevariable;
 class Farmer
 {
	 static void sell(Vegitables v)
	 {
		 v.farming();
	 }
 }
 class Vegitables
 {
	 void farming()
	 {
		 System.out.println("FARMER SELLING VEGITABLE TO CUSTOMER");
	 }
 }
public class Customer3 {
	public static void main(String[] args) {
		Vegitables V = new Vegitables();
		Farmer.sell(V);
	}

}
