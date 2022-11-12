package Assignment_1;
import java.util.*;
public class Revising_Quadratic_Equation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int d = b * b - 4 * a * c;
		if (d > 0) {
			System.out.println("Real and Distinct");
			int x = (int) ((-b - Math.sqrt(d)) / (2 * a));
			int y = (int) ((-b + Math.sqrt(d)) / (2 * a));
			System.out.println(x + " " + y);

		} else if (d == 0) {
			System.out.println("Real and Equal");
			int x = (-b) / (2 * a);
			System.out.println(x + " " + x);

		} else {
			System.out.println("Imaginary");
		}

    }
}