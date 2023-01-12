package org.logicalnumbers;

import java.util.LinkedHashSet;
import java.util.Set;

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

	        Set<Integer> s = new LinkedHashSet<>();
	        s.add(18);
	        s.add(19);
	        s.add(24);
	        s.add(36);
	        s.add(24);
	        s.add(37);
	
	        for (Integer integer : s) {
System.out.println(integer);				
			}
	        
	        System.out.println("MERGING GITHUB");
	        
	}
	 
                   	 

		}	


