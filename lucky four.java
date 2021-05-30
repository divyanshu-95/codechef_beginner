/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
	    	Scanner s = new Scanner(System.in);
        	int n = s.nextInt();
        	for(int i=0;i<n;i++){
        	    int a = s.nextInt();
        	    int rem,count=0;
        	    while(a>0){
        	        rem=a%10;
        	        if(rem==4)
        	            count++;
        	        a=a/10;
        	        
        	    }
        	   System.out.println(count);
        	}
		}catch(Exception e){
		    
		}
	}
}
