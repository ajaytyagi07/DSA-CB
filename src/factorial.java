import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fac(n));
	}
	public static int fac(int n) {
		// base case
		if(n==0) {
			return 1;
		}
		int fn = fac(n-1);
		return n*fn;
	}
}
