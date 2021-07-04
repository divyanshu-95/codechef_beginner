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
		        int x1=s.nextInt();//take numbers
		        int x2=s.nextInt();
		        int y1=s.nextInt();
		        int y2=s.nextInt();
		        int z1=s.nextInt();
		        int z2=s.nextInt();
		        if(x1<=x2&&y1<=y2&&z1>=z2){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
		    }
		}catch(Exception e){
	        
	    }
	}
}
