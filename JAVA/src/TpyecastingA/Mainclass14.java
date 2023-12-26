package TpyecastingA;

class Cola13
{
  int f=210;
  void disp()
  {
	  System.out.println(" THIS IS DISP METHOD");
  }
}
class Chungacha1 extends Cola13
{
   int d=420;
}
public class Mainclass14{
	 public static void main(String[] args) 
	 {
 System.out.println(" *********************** UP CASTING   **************** ");
				Cola13 C= new Chungacha1();
				System.out.println(C.f);
				C.disp();
		
System.out.println(" *********************** DOWN CASTING   **************** ");
Chungacha1	G = (Chungacha1)C;
					System.out.println(G.f);
					G.disp();
					System.out.println(G.d);
	 }

}
