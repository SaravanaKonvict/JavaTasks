package org.logicalnumbers;

import java.util.Arrays;

public class ArrayProgramme {
	
	public static void main(String[] args) {
	
   int [] a = {10,20,50,1,100};
   
   Arrays.sort(a);
       //ascending order 
    for(int i = 0;i<a.length;i++) {
    	
    	System.out.print(a[i]+" ");
    }
    System.out.println();
    //descending order 
   
    for(int i=a.length-1;i>=0;i--) {
    	
    	System.out.print(a[i]+" ");
    	
    }
    System.out.print("maximum value" + a[a.length-1]);
    
    
    
   
      
      }
	
	
	
	
}      