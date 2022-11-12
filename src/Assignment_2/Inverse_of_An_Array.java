package Assignment_2;
import java.util.*;
public class Inverse_of_An_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        inverseArray(arr,brr);
         for(int i=0; i<arr.length; i++){
             System.out.print(brr[i]+" ");
         }
    }
         public static void inverseArray(int[] arr,int[] brr){
               for(int i=0; i<arr.length; i++){
                   brr[arr[i]]=i;

         
         }
         }
}