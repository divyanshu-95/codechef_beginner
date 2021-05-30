import java.util.*;
class CodeChef{
    public static void main(String[] args){
        try{
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();//testcase
        
        for(int i=0;i<n;i++){
            int a=s.nextInt();//numbers
            int revers=0,last;//ye yahi
            while(a!=0){
                last = a % 10;//last digit
                revers = revers * 10 + last;//store the reverse value
                a /= 10;//for rmaining value
            }
            System.out.println(revers);
        }
        }catch(Exception e){
            
        }
    }
}
