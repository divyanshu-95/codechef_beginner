/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args) {
        try{
             Scanner s = new Scanner(System.in);
             int nika= s.nextInt();
             double hai = s.nextDouble();
             if(nika+0.50<=hai&&nika%5==0){
                hai=hai-nika-0.50;
             }
            System.out.println(hai);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}