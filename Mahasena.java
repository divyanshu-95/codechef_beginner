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
		    int even=0;
		    int odd=0;
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=s.nextInt();
		    }
		    for(int j=0;j<n;j++){
		        if(a[j]%2==0){
		            even++;
		        }
		    }
		    odd=n-even;
		    if(even>odd){
		        System.out.println("READY FOR BATTLE");
		    }else{
		        System.out.println("NOT READY");
		    }
		}catch(Exception e){
	        
	    }
	}
}
