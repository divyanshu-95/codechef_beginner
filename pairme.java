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
		        int b=s.nextInt();
		        int c=s.nextInt();
		        if(a+b==c||b+c==a||c+a==b){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
		      
		    }
		}catch(Exception e){
	        
	    }
	}
}
