package TpyecastingA;

class Tester1
{ int x=12;
   void disp()
   {
	   System.out.println("THIS IS DISP METHOD ");
   }
}
class Huliyacha extends Tester1
{
   void ho()
   {
	   System.out.println("THIS IS HO METHOD ");
   }
}
public class Mainclass8 {
	 public static void main(String[] args) 
	 {
 System.out.println(" *********************** UP CASTING   **************** ");
				Tester1 S= new Huliyacha();
				System.out.println(S.x)	;
				S.disp();
		
System.out.println(" *********************** DOWN CASTING   **************** ");
Huliyacha	G = (Huliyacha)S;
System.out.println(G.x)	;
			G.disp();
			G.ho();
			
	 }

}
