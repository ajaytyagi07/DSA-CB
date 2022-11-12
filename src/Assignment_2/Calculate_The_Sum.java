package Assignment_2;
import java.util.*;
public class Calculate_The_Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int Q = sc.nextInt();
        while(Q-->0){
            int x = sc.nextInt();
            int[] brr = new int[n];
			for (int i = 0; i < arr.length; i++) {
                int a = i - x;
				if (a< 0) {
					a = a + n;
				}
				brr[i] = arr[i] + arr[a];


            }
            arr=brr;
        }
        int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		sum = sum % 1000000007;
		System.out.println(sum);

    }
}
