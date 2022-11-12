package Assignment_1;
import java.util.*;
public class Count_Digit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit = sc.nextInt();
		int c = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem == digit) {
				c++;
			}
			n /= 10;
		}
		System.out.println(c);

	}

    
}