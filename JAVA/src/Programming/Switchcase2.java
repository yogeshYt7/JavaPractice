package Programming;
import java.util.Scanner;
public class Switchcase2 {
	public static void main(String[] args) {
		System.out.println("enter value");
		Scanner k=new Scanner(System.in);
		String ip=k.next();
		switch (ip) {
		case "Sunday": System.out.println(0);
			break;
		case "Monday": System.out.println(1);
		break;
		case "Tuesday": System.out.println(2);
		break;
		case "wednesday": System.out.println(3);
		break;
		case "Thursday": System.out.println(4);
		break;
		case "Friday": System.out.println(6);
		break;
		case "Saturday": System.out.println(7);
		break;
		default:System.out.println("invalid input");
			break;
		}
	}

}
