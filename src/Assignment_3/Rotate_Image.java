package Assignment_3;
import java.util.*;
public class Rotate_Image {
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0; i < arr.length; i++) {

      for (int j = 0; j < arr.length; j++) {

            arr[i][j]=sc.nextInt();

			}
    
    }
    RotateImage(arr);
    for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + " ");
			}

			System.out.println();


    }
    }
    public static void RotateImage(int[][] arr){
           
            for(int i = 0; i<arr.length;i++){
                ReverseArray(arr[i]);
            }

             Transpose(arr);

    }


    public static void Transpose(int[][] arr){

        for(int i = 0; i<arr.length;i++){

            for(int j = i+1; j<arr.length;j++){

                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void ReverseArray(int[] arr) {

		int i = 0;
		int j = arr.length - 1;

		while (i< j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

    
}
