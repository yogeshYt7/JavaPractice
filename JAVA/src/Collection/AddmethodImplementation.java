package Collection;

import java.util.Iterator;

public class AddmethodImplementation {

	 Object []arr =new Object[10];
	 int size=0;
	 public void add(Object obj)
	 {
		 capcity();
		 arr[size]=obj;
		 size++;
		 
	 }
		
	public void capcity() 
	{
		//when the arrlength and size variable are same then onlywe have to increase the size of array
		if(size==arr.length)
		{  
			int newcapcity=(arr.length*3/2)+1;
			//for vector class
	        // int newcapcity ==arr.length	
			//................................
			//new temp arr will =be created with arr array size
			Object temp[]=new Object[arr.length];
			//copying from arr arary to temp array
			
			for (int i = 0; i < arr.length; i++)
			{
				temp[i]=arr[i];
			}
			arr=new Object [newcapcity];
			
			for (int i = 0; i < temp.length; i++) 
			{
				arr[i]=temp[i];
			}
			//(or)
			// Arrays.copy(arr,newcapacity)
		}
		
	}
			public String toString() 
			{
				//[object,object........]to get format we are using concatation
				String s="[";
				for (int i = 0; i < size; i++)
				{
					s=s+arr[i];
					if (i<size-1) 
					{
					 s=s+",";	
					}
				}
				s=s+"]";
				return s;
			}
	public int size() 
	{
		return size;
		}
	public boolean isEmpty() 
	{
		return size==0;
		}
	public static void main(String[] args) 
	{
		AddmethodImplementation A=new AddmethodImplementation();
		A.add(10);
		A.add(12.25);
		A.add('y');
		A.add("Abhiii");
		A.add(true);
		System.out.println(A);
		System.out.println(A.size());	
		System.out.println(A.isEmpty());	
	
	}

}
