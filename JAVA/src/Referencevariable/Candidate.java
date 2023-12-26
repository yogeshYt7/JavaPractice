package Referencevariable;
 class Naukri
 {
	static void getjob(Ibm t) 
	 {
		t.job();
	 }
 }
 class Ibm
 {
	 void job() 
	 {
		System.out.println("OFFRED..... OFFERED....OFFER CLOSES SOOON.... ");
	 }
 }
public class Candidate {
	public static void main(String[] args) {
		Ibm T = new Ibm();
		Naukri.getjob(T);
		
	}

}
