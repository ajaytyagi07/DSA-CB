package Assignment_3;
import java.util.*;
public class Array_Wave_Print_Rowwise {
    public static void main(String args[]) {
        // Your Code Here  int n = sc.nextInt();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
    }
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col= 0; col < arr[0].length; col++) {
					System.out.print(arr[row][col]+"," + " " );

				}
			} else {
				for (int col = arr[0].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] +","+ " ");
                  
				}
               
			}
             

		}
           System.out.print("END");
	}

}
