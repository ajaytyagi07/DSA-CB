package Lec_3;
import java.util.Scanner;
public class pattern28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		while (row <= n) {

			
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

		
			int val = row;
			int i = 1;
			while (i <= star) {
				System.out.print(val + " ");
				if (i <= star / 2) {
					val++;
				}
				else {
					val--;
				}
				i++;
			}

			row++;
			System.out.println();
			space--;
			star += 2;

		}

	}

}
