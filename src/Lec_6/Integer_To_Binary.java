package Lec_6;
import java.util.Scanner;
public class Integer_To_Binary {
public static void main(String[] args) {
		
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
