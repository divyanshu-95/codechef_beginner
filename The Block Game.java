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
		        int r,sum=0;
		        int a=s.nextInt();//take numbers
		        int t=a;//store in temporary
		        while(a>0){
		            r=a%10;
		            sum=(sum*10)+r;
		            a=a/10;//remaing no
		        }
		        if(sum==t){
		            System.out.println("wins");
		        }else{
		            System.out.println("loses");
		        }
		        
		      
		    }
		}catch(Exception e){
	        
	    }
	}
}
