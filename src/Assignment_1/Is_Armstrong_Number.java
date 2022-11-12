package Assignment_1;
import java.util.Scanner;

public class Is_Armstrong_Number{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(IsArmstrongNumber(n));

	}

	public static boolean IsArmstrongNumber(int n) {
		int m = countofdigit(n);
		int ans = 0;
		int temp = n;
		while (n > 0) {
			int rem = n % 10;
			ans = ans + (int) (Math.pow(rem, m));
			n /= 10;

		}
		if (ans == temp) {
			return true;
		} else {
			return false;
		}

	}

	public static int countofdigit(int n) {

		int c = 0;
		while (n > 0) {

			n /= 10;
			c++;
		}

		return c;

	}


}