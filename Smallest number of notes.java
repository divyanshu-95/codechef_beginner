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
		        int count=0;
		        int a=s.nextInt();
		        while(a!=0){
		            if(a>=100){
		                a=a-100;
		                count++;
		            }else if(a>=50){
		                a=a-50;
		                count++;
		            }else if(a>=10){
		                a=a-10;
		                count++;
		            }
		            else if(a>=5){
		                a=a-5;
		                count++;
		            }else if(a>=2){
		                a=a-2;
		                count++;
		            }else if(a>=1){
		                a=a-1;
		                count++;
		            }
		        }System.out.println(count);
		      
		    }
		}catch(Exception e){
	        
	    }
	}
}
