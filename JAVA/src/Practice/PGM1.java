package Practice;

public class PGM1 {
	public static void main(String[] args) {
		int answer=0;
		int [] pants1 = {3,2,2,1,15};
		int [] shirts1 = {3,4,6};
		int [] shoes1 = {1,4};
		int [] skirts1 = {2,3};
		int budget1=8;
	 for (int i = 0; i < pants1.length; i++) 
	 {
		 for (int j = 0; j < shirts1.length; j++) 
		 {
			for (int k = 0; k < shoes1.length; k++) 
			{
				for (int l = 0; l < skirts1.length; l++) 
				{
					if (pants1[i]+shirts1[j]+shoes1[k]+skirts1[l]<=budget1)
					{
						answer+=1;
					}
				}
			}
	   	}
	 }
	 System.out.println(answer);
	}

}
