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
		        int m=s.nextInt();//take numbers
		        int h=s.nextInt();
		        int o=m/(h*h);
		        if(o<=18){
		            System.out.println("1");
		        }else if(o<=24){
		            System.out.println("2");
		        }else if(o<=29){
		            System.out.println("3");
		        }else if(o>=30){
		            System.out.println("4");
		        }
		    }
		}catch(Exception e){
	        
	    }
	}
}
