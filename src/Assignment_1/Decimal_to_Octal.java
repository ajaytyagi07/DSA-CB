package Assignment_1;
import java.util.*;
public class Decimal_to_Octal {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		int mul=1;
		while(n>0) {
			int rem=n%8;
			sum=sum+rem*mul;
			n=n/8;
			mul=mul*10;
			
		}
		System.out.println(sum);
    }
}
