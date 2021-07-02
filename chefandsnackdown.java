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
		    for (int i=0;i<n;i++){
		        int a=s.nextInt();//take numbers
		        if(a==2010 ||a==2015||a==2016||a==2019||a==2017){
		            System.out.println("HOSTED");
		        }else{
		            System.out.println("NOT HOSTED");
		        }
		      
		    }
		}catch(Exception e){
	        
	    }
	}
}
