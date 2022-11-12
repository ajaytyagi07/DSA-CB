package Lec_5;
import java.util.Scanner;
public class GCD {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		int dividend = sc.nextInt();
		while(divisor%dividend!=0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println("GCD is" + divisor);
		}

}
