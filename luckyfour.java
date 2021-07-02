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
		        int c=0;
		        while(a>0){
		            int rem=a%10;
		            if(rem==4){
		                c++;
		            }
		            a=a/10;
		        }
		        System.out.println(c);
		      
		    }
		}catch(Exception e){
	        
	    }
	}
}
