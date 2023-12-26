package Arrayassignments;

public class Pgm1 {
  static void range(int []abb)
  {
	  for (int i = abb.length-1 ; i>=0; i--) 
	  {
		System.out.print(abb[i]+" ");
	  }
  }
  public static void main(String[] args) {
	int []arr= {1,2,3,4,5};
	range(arr);
}
}
