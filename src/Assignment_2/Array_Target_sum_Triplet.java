package Assignment_2;
import java.util.*;
public class Array_Target_sum_Triplet{
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) 
        {
			arr[i] = sc.nextInt();

		}
		int target = sc.nextInt();
		Arrays.sort(arr);

		for(int i = 0; i<arr.length-1;i++){
            for(int j = i+1;j<arr.length-1;j++){
                for(int k = j+1;k<=arr.length-1;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                       System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    }
                }
            }
             
        }

    }
}