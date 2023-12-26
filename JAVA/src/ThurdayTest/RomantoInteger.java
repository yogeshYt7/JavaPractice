package ThurdayTest;

public class RomantoInteger {
	       static int romanToInt(String s) {
	        int number = 0;
	        int answer = 0;
	        int prev = 0;
	        for (int i = s.length() - 1; i >= 0; i--) {
	        	char ch=s.charAt(i);
	            if (ch== 'I') {
	                number = 1;
	            } else if ( ch== 'V') {
	                number = 5;
	            } else if (ch == 'X') {
	                number = 10;
	            } else if (ch == 'L') {
	                number = 50;
	            } else if (ch == 'C') {
	                number = 100;
	            } else if (ch== 'D') {
	                number = 500;
	            } else if (ch == 'M') {
	                number = 1000;
	            }
	            if (number < prev) {
	                answer -= number;
	            } else {
	                answer += number;
	            }
	            prev = number;
	        }
	        return answer;
	    }
	       public static void main(String[] args) {
			String str="XI";
			System.out.println(romanToInt(str));
		}
	}



