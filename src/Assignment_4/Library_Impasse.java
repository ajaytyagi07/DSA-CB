package Assignment_4;
import java.util.*;
public class Library_Impasse {
    public static void main (String args[]) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(index(arr));
    }
        public static int index(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] =  arr[i] + left[i - 1];  
        }
        
        int[] right = new int[n];
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = arr[i] + right[i + 1];
        }
        
        for (int i = 0; i < n; i++ ) {
            if (left[i] == right[i] ) {
                return i;
            }
        }
        return -1;

    }
}