package TpyecastingA;

class Cola1
{
  int f=52;
}
class Chungacha extends Cola1
{
   int d=143;
}
public class Mainclass7{
	 public static void main(String[] args) 
	 {
 System.out.println(" *********************** UP CASTING   **************** ");
				Cola1 C= new Chungacha();
				System.out.println(C.f);
		
System.out.println(" *********************** DOWN CASTING   **************** ");
					Chungacha	G = (Chungacha)C;
					System.out.println(G.f);
					System.out.println(G.d);
	 }

}
