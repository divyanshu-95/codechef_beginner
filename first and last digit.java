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
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();//test cases
	    int first,last,a;
	    while(n>0){
	        a=s.nextInt();
	        last=a%10;
	        while(a>=10){
	            a=a/10;
	        }
	        first=a;
	        System.out.println(first+last);
	    }
	    }catch(Exception e){
	        
	    }
	    
	}
}
