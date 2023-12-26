package Methodoverloading;

class Money
{ 
void payment(long a)
{
	 System.out.println("payment done with mobile number to mob number "+a);
}
void payment(String b)
{
	 System.out.println("payment done with "+ b);
}
void payment(int c)
{
	 System.out.println("RS "+c+" Money pay to shopkeeper");
}
}
public class Paytm {
	public static void main(String[] args) {
		Money P=new Money();
		P.payment(7816074954l);
		P.payment("SCANNER");
		P.payment(1116);
	}

}
