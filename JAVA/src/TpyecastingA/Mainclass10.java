package TpyecastingA;

class Tester3
{   int x=12;
   void disp()
   {
	   System.out.println("THIS IS DISP METHOD ");
   }
}
class Tista1 extends Tester3
{  
   void tata()
   {    
	   System.out.println("THIS IS TATA METHOD ");
   }
}
public class Mainclass10{
	 public static void main(String[] args) 
	 {
 System.out.println(" *********************** UP CASTING   **************** ");
 Tester3 S= new Tista1();
 System.out.println(S.x)	;
				S.disp();
		
System.out.println(" *********************** DOWN CASTING   **************** ");
Tista1 G = (Tista1)S;
System.out.println(G.x);
G.disp();
G.tata();
			
	 }

}
