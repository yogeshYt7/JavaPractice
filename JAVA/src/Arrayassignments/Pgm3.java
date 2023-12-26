
package Arrayassignments;

public class Pgm3 {
  static void even(int []abb)
  {
	  for (int i =0; i<abb.length; i++) 
	  {
		  if (abb[i]%2==1) {
			
		System.out.print(abb[i]+" ");
	  }
	  }
  }
  public static void main(String[] args) {
	int []arr= {1,2,3,4,5};
	even(arr);
}
}
