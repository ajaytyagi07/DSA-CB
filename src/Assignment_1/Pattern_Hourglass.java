package Assignment_1;
import java.util.Scanner;

public class Pattern_Hourglass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 2 * n + 1;
		int space = 0;
		int m = n;
		while (row <= 2 * n + 1) {

			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int s = m;
			while (j <= star) {
				System.out.print(s + " ");
				if (j <= star / 2) {
					s--;
				} else {
					s++;
				}
				j++;
			}
			if (row <= n) {
				star -= 2;
				space++;
				m--;

			} else {
				star += 2;
				space--;
				m++;
			}
			row++;
			System.out.println();
		}

	}

}
