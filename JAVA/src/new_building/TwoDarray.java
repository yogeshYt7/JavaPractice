package new_building;
import java.util.Scanner;

public class TwoDarray {
	public static void main(String[] args) {
		String [] [] s1={{"Dharamaraya","Arjun","Bheema"},{"Nakula","Sahadeva","Karna"},{"Dhuryodhana","Bheeshma","Krishna"}};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String k=sc.next();
		for (int row = 0; row < s1.length; row++) {
			{
				for(int col=0;col<s1[row].length;col++)
				{
					if(s1[row][col].equals(k)){
					System.out.print(s1[row][col]+" "+" is in "+row+" and "+col);
					
					}
				}
				System.out.println();
				
				
		}
			
		}
	}

}
