package Assignment_3;
import java.util.*;
public class Transpose_of_Square_Matrix {
    public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[][] arr = new int[n][n];
    for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=sc.nextInt();
			}
    }
   Transpose(arr);
   
   for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();


    }
        
 }
 public static void Transpose(int[][] arr){
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                int t = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i] = t;
            }
        }
    }
}
