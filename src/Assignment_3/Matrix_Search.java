package Assignment_3;
import java.util.*;
public class Matrix_Search {
    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[][] arr = new int[n][m];
    for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
    }
         int item = sc.nextInt();
        System.out.println(Search(arr, item));

	}

	public static int Search(int[][] arr, int item) {
		int row = 0;
		int col = arr[0].length - 1;
		while (row < arr.length && col >= 0) {

			if (arr[row][col] == item) {
				return 1;
			} else if (arr[row][col] > item) {
				col--;
			} else {
				row++;
			}

		}
		return 0;

    }
}