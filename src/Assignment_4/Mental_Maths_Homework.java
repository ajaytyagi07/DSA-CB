package Assignment_4;
import java.util.*;
public class Mental_Maths_Homework {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       Arrays.sort(arr);
        n = arr.length;
       int a = arr[n-1]*arr[n-2]*arr[n-3];
       int b = arr[0]*arr[1]*arr[n-1];
		System.out.println(Math.max(a,b)); 
    }
}
