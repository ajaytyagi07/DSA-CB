package Assignment_2;
import java.util.*;
class Product_of_Array_Except_Itself{
public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int[] arr = new int[n];
       for (int i=0;i<arr.length;i++){
           arr[i]= sc.nextInt();
       }
		
		long [] ans= product(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}

	public static long[] product(int arr[]) {
		int n = arr.length;
		long[] left = new long[n];
		long[] right = new long[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * arr[i - 1];

		}
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];

		}
		for (int i = 0; i < right.length; i++) {
			left[i] = left[i] * right[i];
		}
		return left;

	}
}
