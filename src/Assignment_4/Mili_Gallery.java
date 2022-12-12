package Assignment_4;
import java.util.*;
public class Mili_Gallery{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0 ; i < n ; i++){
            ar[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        int cnt = 0;
        int i = 0;
        int j = 0;
        int a = 0;
        while(j<ar.length && ar[j]==0){
              cnt++;
             j++;
        }
        if(cnt!=0 && cnt%2==0){
            cnt = cnt/2;
        }
        else{
            cnt = cnt/2;
        }
        a += cnt;
        cnt = 0;
        i = j;
        while ( i < ar.length){
            if(ar[i] == 0){
                cnt++;
            }
            else {
                if(cnt!=0 && cnt%2==0){
                    cnt = cnt/2 -1;
                }
                else{
                    cnt = cnt/2;
                }
                 a += cnt;
                 cnt = 0;
            }
                i++;
        }
        if(cnt!=0 && cnt%2==0){
            cnt = cnt/2;
        }
        else{
            cnt = cnt/2;
        }
        a += cnt;
        cnt = 0;
        if(a >= K){
             System.out.println(true);
        }
        else {
             System.out.println(false);
        }
    }
}