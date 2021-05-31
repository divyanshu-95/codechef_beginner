/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();//testcase
		    if(n%4==0){
		        System.out.println(n+1);
		    }else{
		        System.out.println(n-1);
		    }
		}catch(Exception e){
	        
	    }
	}
}
