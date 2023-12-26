package Collection;

public class ContainsMTHD 
{
	Object []arr =new Object[10];
		int size=0;
		 public void add(Object obj)
		 {
			 capcity();
			 arr[size]=obj;
			 size++; 
		 }
		 public void add(int index ,Object obj)
		 {
			 if (index <0|| index>=size) 
			 {
				 throw new ArrayIndexOutOfBoundsException();
			 }
			 for (int i = size; i >=index; i--)
			 {
				 arr[i+1]=arr[i];
			 }
			 arr[index]=obj;
			 size++;
		 }
			
 public void capcity() 
		{
			
			if(size==arr.length)
			{  
				int newcapcity=(arr.length*3/2)+1;
				
			Object temp[]=new Object[arr.length];
				
				
			for (int i = 0; i < arr.length; i++)
			{
					temp[i]=arr[i];
			}
				arr=new Object [newcapcity];
				
				for (int i = 0; i < temp.length; i++) 
				{
					arr[i]=temp[i];
				}
				
			}
			
		}
		public String toString() 
		{
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
		private boolean contains(Object obj) 
		{
			for (int i = 0; i < arr.length; i++) 
			{
				if (obj==null) 
				{
					if (arr[i]==null)
					{
						return true;
					}
				}else if (arr[i]!=null)
				{
					if (arr[i].equals(obj))
					{
						return true;
					}
				}
			}
			return false;
		}
		public static void main(String[] args) 
		{
			ContainsMTHD A=new ContainsMTHD();
			A.add(10);
			A.add(12.25);
			A.add('y');
			A.add("Abhiii");
			A.add(true);
			A.add(10);
			A.add(12.25);
			A.add('y');
			A.add("Abhiii");
			A.add(true);
			A.add(10);
			A.add(12.25);
			A.add('y');
			A.add("Abhiii");
			A.add(true);
			A.add(10);
			A.add(12.25);
			A.add('y');
			A.add("Abhiii");
			A.add(true);A.add(10);
			A.add(12.25);
			A.add('y');
			A.add("Abhiii");
			A.add(true);
			System.out.println(A.size());
			System.out.println(A);
			
			System.out.println(A.contains("Abhiii"));
		
		}



	}
