package new_building;

class SBI
{
	private int ATM=1234;
	public int getATM()
	{
		return ATM;
	}
	public void setATM(int aTM)
	{
		this.ATM=aTM;
	}
}

public class Encaps {
	public static void main(String[] args) {
		SBI s1=new SBI();
		System.out.println(s1.getATM());
		s1.setATM(9876);
		System.out.println(s1.getATM());
	}
}
