package new_building;
import java.io.IOException;
import java.util.Scanner;
public class ToshutDown {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time limit to shutdown:");
		int seconds=sc.nextInt();
		Runtime r=Runtime.getRuntime();
		System.out.println("the Laptop will shutdown within"+ seconds+" seconds");
		try {
			r.exec("shutdown -s -t "+seconds);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
