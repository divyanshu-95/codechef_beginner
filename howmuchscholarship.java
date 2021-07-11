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
		    if(n<=50&&n>=1){
		        System.out.println("100");
		    }else if(n<=100&&n>=51){
		        System.out.println("50");
		    }else{
		        System.out.println("0");
		    }
		}catch(Exception e){
	        
	    }
	}
}
