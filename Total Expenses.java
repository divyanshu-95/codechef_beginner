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
		    double r;
		    for (int i=0;i<n;i++){
		        double q=s.nextDouble();//take numbers
		        double p=s.nextDouble();
		        if(q>1000){
		            r=p*q*0.1;//find 10% of price and quantity
		            System.out.println((p*q)-r);
		        }else{
		            System.out.println(p*q);
		        }
		      
		    }
		}catch(Exception e){
	        
	    }
	}
}
