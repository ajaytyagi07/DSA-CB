package Assignment_1;
import java.util.*;
public class Nth_Fibonacci {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a =0;
		int b = 1;
		for(int i=1; i<=n;i++) {
			int c = a + b;
			a = b;
			b = c;
			}
		System.out.println(a);
    }
}