package Assignment_2;
import java.util.*;
public class Array_Target_Sum_Pair{
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

		TargetSumPairs(arr, target);
     }

	

	public static void TargetSumPairs(int[] arr, int target) {

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			if (arr[i] + arr[j] == target) {
				System.out.println(arr[i] + " and " + arr[j]);
				i++;
				j--;
			}
             else if (arr[i] + arr[j] > target) {
				j--;
			} 
            else {
				i++;
			}
		}

    }
}