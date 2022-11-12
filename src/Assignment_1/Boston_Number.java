package Assignment_1;
import java.util.*;
public class Boston_Number {
    public static void main(String args[]) {
       
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BostonNumbers(n);

	}

	public static void BostonNumbers(int n) {

		int NUM = n;
		int SUM = 0;
		int i = 2;
		while (i <= n) {

			while (n % i == 0) {
				SUM = SUM + SOD(i);
				n = n / i;
			}
			i++;
		}
		int PRIMEFACT = SOD(NUM);
		if (PRIMEFACT == SUM) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

	public static int SOD(int n) {
		
		int SUM = 0;
		while (n > 0) {
			int rem = n % 10;
			SUM = SUM + rem;
			n /= 10;
		}
		return SUM;
		
	}

}