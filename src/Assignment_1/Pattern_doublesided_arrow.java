package Assignment_1;
import java.util.*;
public class Pattern_doublesided_arrow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space1 = n - 1;
		int space2 = -1;
		int star = 1;
		int row = 1;
		int val = 1;
		while (row <= n) {

			
			int i = 1;
			while (i <= space1) {
				System.out.print("  ");
				i++;
			}

			
			int j = 1;
			int p = val;
			while (j <= star) {
				System.out.print(p + " ");
				p--;
				j++;
			}

			
			int k = 1;

			while (k <= space2) {
				System.out.print("  ");
				k++;
			}

		

			j = 1;
			p++;
			if (row == 1 || row == n) {
				j = 2;
				
			}
			while (j <= star) {
				System.out.print(p + " ");
				j++;
				p++;
			}

		
			if (row <= n / 2) {
				space1 -= 2;
				space2 += 2;
				val++;
				star++;
			} else {
				space1 += 2;
				star--;
				space2 -= 2;
				val--;
			}
			row++;
			System.out.println();
        }

    }
}