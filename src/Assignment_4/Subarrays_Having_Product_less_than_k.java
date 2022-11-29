package Assignment_4;
import java.util.*;
public class Subarrays_Having_Product_less_than_k {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        int startindex = 0;
        int endindex = 0;
        int p = 1;
        while(endindex<arr.length){
            p*=arr[endindex];
            
            while(p>=k && startindex<=endindex){
            p/=arr[startindex];
            startindex++;
            }
            ans = ans+(endindex-startindex+1);
            endindex++;
            
        }
        System.out.println(ans);
    }
}