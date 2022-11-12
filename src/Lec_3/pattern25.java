package Lec_3;
import java.util.Scanner;
public class pattern25 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		int k=1;
		while (row <= n) {

			
			int j = 1;
			while (j <= space) {
				System.out.print("\t");
				j++;
			}

			
			int i = 1;
			while (i <= star) {
				System.out.print(k+"\t");
				k++;
				i++;
			}

			row++;
			System.out.println();
			space--;
			star += 2;

		}

	}

}
