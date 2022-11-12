package Lec_3;
import java.util.Scanner;
public class pattern26 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;
		
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int val=1;
			int j = 1;
			while (j <= star) {
				System.out.print(val+"\t");
				j++;
				val++;
			}
			
			System.out.println();
			space--;
			star += 2;
			row++;
		}


	}

}
