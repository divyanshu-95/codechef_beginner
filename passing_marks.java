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
		        int amin=s.nextInt();//take numbers
		        int bmin=s.nextInt();
		        int cmin=s.nextInt();
		        int tmin=s.nextInt();
		        int a=s.nextInt();
		        int b=s.nextInt();
		        int c=s.nextInt();
		        if(amin<=a&&bmin<=b&&cmin<=c&&a+b+c>=tmin){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
		    }
		}catch(Exception e){
	        
	    }
	}
}
