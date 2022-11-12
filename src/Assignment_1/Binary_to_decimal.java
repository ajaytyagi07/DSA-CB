package Assignment_1;
import java.util.*;
public class Binary_to_decimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		int mul=1;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem*mul;
			n=n/10;
			mul=mul*2;
			
		}
		System.out.println(sum);

    }
}