/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();//testcase
		    for (int i=0;i<n;i++){
		         int a=s.nextInt();
		         int b=s.nextInt();
		         if(a==b){
		             System.out.println("=");
		         }else if (a>b){
		             System.out.println(">");
		         }else{
		             System.out.println("<");
		         } 
		    }
		}catch(Exception e){
	        
	    }
	}
}
