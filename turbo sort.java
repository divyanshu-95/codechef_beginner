/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();//test cases
		    int a[]=new int[n];//store numbers in array
		    for(int i=0;i<n;i++){
		        a[i]=s.nextInt();//storing every number
		    }
		    Arrays.sort(a);//sort
		    for(int j=0;j<a.length;j++)
		    {
		        System.out.println(a[j]);//print sorted array
		    }
		    
		    
	    }catch(Exception e){
	        
	    }
	}
}
