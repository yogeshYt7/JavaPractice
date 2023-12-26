package Testfreshers;

class Demo
{ 
 public static void main(String[] args)
{
  int no=8;

for(int i=no+1;i<=25;i++)
{
	
int n=i;
boolean flag=true;

for(int j=2;j<n;j++)
{
	
 if(n%j==0)
{ 
 flag=false;
break;
}
}
if(flag==true)
{
System.out.println(n);
break;
}
 }
}
 }

 
