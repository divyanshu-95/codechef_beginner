/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
		  //  int a,b,sum=0;
		    int n=s.nextInt();//test cases
		    for(int i=0;i<n;i++){
		        int a=s.nextInt();
		        int sum=0;
		        while(a!=0){
		            int b = a % 10;//for last digit
		            sum=sum+b;//for sum
		            a=a/10;//for left digits
		        }
		        System.out.println(sum);
		    }
		    
		
	    
	}
}