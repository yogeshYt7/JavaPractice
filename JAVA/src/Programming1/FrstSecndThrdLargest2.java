package Programming1;
import java.util.Arrays;
public class FrstSecndThrdLargest2 
{
   public static void main(String[] args)
      {
         int []arr= {9,7,8,4,3,5,2,6,10,1};
               Arrays.sort(arr);
           for (int i =arr.length-1 ; i >arr.length-4; i--) 
           {
	           System.out.print(arr[i]);
           }
   }
}