package TpyecastingA;
 
class Sample2
{
   void co()
   {
	   System.out.println("THIS IS CO METHOD ");
   }
}
class Guleyluu extends Sample2
{
   void disp()
   {
	   System.out.println("THIS IS DISP METHOD ");
   }
}
public class Mainclass6 {
	 public static void main(String[] args) 
	 {
 System.out.println(" *********************** UP CASTING   **************** ");
				Sample2 S= new Guleyluu();
					S.co();
		
System.out.println(" *********************** DOWN CASTING   **************** ");
			Guleyluu	G = (Guleyluu)S;
			G.co();
			G.disp();
	 }

}
