package Lec_3;
import java.util.Scanner;
public class PascalTriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int star = 1;
		while (row < n) {

			int R = 0;
			int Ncr = 1;
			while (R < star) {
				System.out.print(Ncr + " ");
				Ncr = (Ncr * (row - R)) / (R + 1);
				R++;
			}
			row++;
			System.out.println();
			star++;

		}

	}
}
