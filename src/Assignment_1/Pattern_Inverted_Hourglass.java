package Assignment_1;
import java.util.*;
public class Pattern_Inverted_Hourglass  {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int space = 2 * n - 1;
		int row = 1;
		while (row <= 2 * n + 1) {
			
			int i = 1;
			int m = n;
			while (i <= star) {
				System.out.print(m+" ");
				m--;
				i++;
			}

			
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			
			int k = 1;
			m++;
			if (row == n + 1) {
				k = 2;
				m++;
			}
			while (k <= star) {
				System.out.print(m + " ");
				k++;
				m++;
			}

			
			if (row <= n) {
				star++;
				space -= 2;
			} else {
				star--;
				space += 2;
			}
			System.out.println();
			row++;

		}

}
}