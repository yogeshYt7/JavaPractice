package ThurdayTest;

public class mock {
	public static void main(String[] args) {
		
		        int[] arr = {17, 27, 26, 88, 90};
		        int count = 0;
		        for (int num : arr) {
		            int n = num;
		            
		            boolean flag = false;
		            while (n != 0) {
		                int rem = n % 10;
		                if (rem == 7) {
		                    flag = true;
		                    break; 
		                }
		                n /= 10; 
		            }

		            if (flag) {
		                count++;
		            }
		        }

		        System.out.println("Number of elements containing '7' in the array: " + count);
		    }

	}


