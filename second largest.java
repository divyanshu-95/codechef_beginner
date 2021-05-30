import java.util.*;
import java.lang.*;
import java.io.*;
class CodeChef{
    public static void main(String[] args){
        try{
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();//test cases
            for(int i=0;i<n;i++){
                int a=s.nextInt();
                int b=s.nextInt();
                int c=s.nextInt();
                if(a>b&&a<c || a>c&&a<b){
                    System.out.println(a);
                }else if (b>c&&b<a || b>a&&b<c){
                    System.out.println(b);
                } else if(c>b&&c<a || c>a&&c<b){
                    System.out.println(c);
                }
            }
        }catch(Exception e){
            
        }
    }
}
