 package TpyecastingA;

class Sample21
{  int r=2;
   void co()
   {
	   System.out.println("THIS IS CO METHOD ");
   }
}
class Hahoha extends Sample21
{
   void disp()
   {
	   System.out.println("THIS IS DISP METHOD ");
   }
}
public class Mainclass13 {
	 public static void main(String[] args) 
	 {
 System.out.println(" *********************** UP CASTING   **************** ");
				Sample21 S= new Hahoha();
				System.out.println(S.r);
							S.co();
		
System.out.println(" *********************** DOWN CASTING   **************** ");
			Hahoha	G = (Hahoha)S;
			System.out.println(G.r);
					G.co();
					G.disp();
	 }

}
