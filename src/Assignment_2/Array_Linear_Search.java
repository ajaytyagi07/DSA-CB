package Assignment_2;
import java.util.*;
public class Array_Linear_Search {
    public static void main(String args[]) {
        // Your Code Here
         Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int item = sc.nextInt();
        System.out.println(Search(arr,item));                                                     
    }
    public static int Search(int[] arr,int item){
        for (int i=0;i<arr.length;i++){
            if(arr[i]== item){
            return i;
            }

        }

    
    return -1;
    

    }
}