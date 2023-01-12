package org.logicalnumbers;

public class Reversenumber {
	
	public static void main(String[] args) {
		
		 int a =321456;
	       int r=0;
	int count = 0;   
	int sum = 0;
	        while(a>0) {
	         
	         int b=a/10;
	         int c=a%10;
	         r=c+(r*10);
	 count++;
	        a=b;
	        sum=sum+c;
	        
	          }
	        
	        System.out.println(r);
	        
	        System.out.println("the count of the digit is "+ count);
	        
	        System.out.println("sum of the value is "+ sum); 
	        
	        System.out.println("Git Hub try");

	}
	 
                   	 

		}	


