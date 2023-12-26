package TpyecastingA;

class Cool2
{ 
   void disp()
   {
	   System.out.println("THIS IS DISP METHOD ");
   }
}
class Dinga extends Cool2
{  int x=12;
   void tata()
   {    
	   System.out.println("THIS IS TATA METHOD ");
   }
}
public class Mainclass9{
	 public static void main(String[] args) 
	 {
 System.out.println(" *********************** UP CASTING   **************** ");
 			Cool2 S= new Dinga();
				S.disp();
		
System.out.println(" *********************** DOWN CASTING   **************** ");
Dinga G = (Dinga)S;
System.out.println(G.x)	;
G.disp();
G.tata();
			
	 }

}
