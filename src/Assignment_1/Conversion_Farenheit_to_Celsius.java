package Assignment_1;
import java.util.*;
public class Conversion_Farenheit_to_Celsius {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		int minfahrenheit = sc.nextInt();
		int maxfahrenheit = sc.nextInt();
		int step = sc.nextInt();

		for (int i = minfahrenheit; i <= maxfahrenheit; i = i + step) {

			int c = (int) ((5.0 / 9) * (i - 32));
			System.out.println(i + "\t" + c);

		}
    }
}