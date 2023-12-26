package Methodoverriding;

class Google1
{
	void Search()
	{
		
		System.out.println("Searching with text ");
	}
}
class Google2 extends Google1
{
	void search()
	{
		
		System.out.println("Searching with text + voice + lens ");
	}
}
public class Main2 {
	public static void main(String[] args) {
		Google2 v = new Google2();
		v.search();
	}

}