package Assignment_4;
import java.util.*;
public class Perance_Party {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0 ; i < n ; i++){
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int a = 0;
        for(int i = 0; i < ar.length; i = i+2){
            a += Math.min(ar[i],ar[i+1]);
        }
        System.out.println(a);
    }
}