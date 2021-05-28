import java.util.*;
class CodeChef{
    public static void main(String[]args){
        try{
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int a=s.nextInt();//Number
            int b=s.nextInt();//for which modulo
            System.out.println(a%b);
        }
        }catch(Exception e){
            
        }
    }
}
