package org.java;

public class ReverseNumber {
       
	
	public static void main(String[] args) {
		
		 int a =1235321;
		 int sum = 0;
		 int rem = 0;
		 
		 while(a>0) {
		
            rem=a%10;
            sum=sum+rem;
            a=a/10;
			 
			 
		 }
		 
		 System.out.println(sum);
		 
		 
		 
		 
	       }
	
	   
}
