package Assignment_1;
import java.util.*;
public class INVERSE_OF_NUMBER {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int rev = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + rev * Math.pow(10, rem - 1));
			n = n / 10;
			rev++;

		}
		System.out.println(sum);

       

    }
}