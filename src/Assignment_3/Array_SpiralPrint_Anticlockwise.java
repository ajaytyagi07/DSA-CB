package Assignment_3;
import java.util.*;
public class Array_SpiralPrint_Anticlockwise {
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
		int minrow = 0;
        int maxrow = arr.length-1 ;
		int mincol = 0;
		int maxcol = arr[0].length-1;
		int total = arr.length * arr[0].length;
		int count = 0;
		while (count < total) {
            for (int i = minrow; i <= maxrow && count < total; i++) {
				System.out.print(arr[i][mincol] +","+ " ");
				count++;
			}
			mincol++;
			for (int i = mincol; i <= maxcol && count < total; i++ ) {
				System.out.print(arr[maxrow][i] +","+ " ");
				count++;

			}
			maxrow--;
            for (int i = maxrow; i >= minrow && count < total; i--) {
				System.out.print(arr[i][maxcol] +","+ " ");
				count++;

			}
			maxcol--;
			
			for (int i = maxcol; i >= mincol  && count < total; i--) {
				System.out.print(arr[minrow][i] +","+ " ");
				count++;
			}
			minrow++;
			
		}
        System.out.print("END");
	}

}
