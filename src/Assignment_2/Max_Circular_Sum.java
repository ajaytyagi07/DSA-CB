package Assignment_2;
import java.util.*;
public class Max_Circular_Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(MaxSum(arr));
        
        }

    }
    public static int MaxSum(int[] arr){
        int LinearKadane = Kadane(arr);
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum = sum+arr[i];
            arr[i] = arr[i]*-1;
        }
        int InvertedKadane = Kadane(arr);
        int circleKadane = InvertedKadane + sum;
        return Math.max(LinearKadane , circleKadane);
    }

    public static int Kadane(int[] arr){
        int ans = Integer.MIN_VALUE;
		int previoussum = 0;
		for (int i = 0; i < arr.length; i++) {
			previoussum += arr[i];
			ans = Math.max(ans, previoussum);

			if (previoussum < 0) {
				previoussum = 0;
			}
		}
		return ans;

    }
}
