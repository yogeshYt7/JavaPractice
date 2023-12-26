package Testquestions;


 class Question1{    
	public static void main(String[] args) {
     int count=0;
    for(int i=2;i<=100;i++) {
        boolean flag=true;
        int n1 = i;
        for (int j = 3; j < n1; j++) {
            flag = false;
            break;
        }
    
    if (flag){
        count++;
    }
    if (count%2==0){
        int n=count;
        while(n!=0){
            n=add(n);
        }
    }
}
	}
    static int add(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem*rem;
            n=n/10;
        }
        return 0;
    }
}
