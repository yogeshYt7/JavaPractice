package Methodoverloading;

class Bankaccount {
	static void Account(String ifc)
	{
		System.out.println("Account type is "+ ifc);
	}
	static void Account(long no)
	{
		System.out.println("Acccount number "+ no);
	}
	static void Account(String type,String type1 )
	{
		System.out.println("Account type is "+ type);
		System.out.println("Card type "+ type1);
	}
}
public class Bank{
	public static void main(String[]args)
	{
		Bankaccount.Account("SBINY00003");
		Bankaccount.Account(125648555555626l);
		Bankaccount.Account("savings acoount","Debit card");
	}
	
}

