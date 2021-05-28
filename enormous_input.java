import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.*;


// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//test cases
		int b=s.nextInt();//which no divide
		int a, fina=0;//how many numbers
		for(int i=0;i<n;i++){
		    a=s.nextInt();//numbers
		    
		    if(a%b==0){
		        fina++;
		    }
		}
		System.out.print(fina);
	}
}
