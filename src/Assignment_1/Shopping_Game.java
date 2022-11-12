package Assignment_1;
import java.util.*;
public class Shopping_Game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();

			int x = 0;
			int y = 0;
			int count = 1;
			while (true) {
				x = x + count;
				if (x > m) {
					System.out.println("Harshit");
					break;
				}
				count++;
				y = y + count;
				if (y > n) {
					System.out.println("Aayush");
					break;
				}
				count++;

			}
			T--;
		}

    }
}