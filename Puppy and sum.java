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
		    Scanner s =new Scanner(System.in);
		    int n=s.nextInt();
		    int sum=0;//here we initialize
		    for(int i=0;i<n;i++){
		        int a=s.nextInt();
		        int b=s.nextInt();
		        for(int k=0;k<a;k++){
		            sum=0;//when we in this loop the sum is 0
		            for(int j=1;j<=b;j++){
		                sum=sum+j;
		            }
		            b=sum;//store in b
		        }
		        System.out.println(sum);
		    }
		}catch(Exception e){
	        
	    }
	}
}
