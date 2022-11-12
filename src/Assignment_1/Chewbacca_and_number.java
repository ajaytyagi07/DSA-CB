package Assignment_1;
import java.util.*;
public class Chewbacca_and_number {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 0;
        long a = 1;
		while (n > 0) {
			long rem = n % 10;
			if (rem >= 5 && n != 9) {
				sum = sum + (9 - rem) * a;
			} else {
				sum = sum + rem * a;
			}

			n = n / 10;
		    a = a * 10;
		}
		System.out.println(sum);

    }
}
