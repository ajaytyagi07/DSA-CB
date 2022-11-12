package Assignment_1;
import java.util.*;
public class Von_Newmann_Loves_Binary {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
        while(n>0){
        long m=sc.nextLong();
        long a = binarytodecimal(m);
        System.out.println(a);
        n--;
        }
    }
    public static long binarytodecimal(long n){
		long sum =0;
		long mul=1;
        
		while(n>0) {
			long rem=n%10;
			sum=sum+rem*mul;
			n=n/10;
			mul=mul*2;
			
		}
		//System.out.println(sum);
        return sum;
    }
    
    
}