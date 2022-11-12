package Assignment_2;
import java.util.*;
public class Running_Sum_Of_given_Array {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
      int sum=0;
       
        for(int i=0;i<n;i++){
           sum= sum+arr[i];
           arr[i]=sum;

        }

        for(int i = 0;i<n;i++){
        System.out.print(arr[i]+" ");
        }

    }
}