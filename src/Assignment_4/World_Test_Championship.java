package Assignment_4;
import java.util.*;
public class World_Test_Championship {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []ar = new int [n];
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();}
            int endindex = 0;
            int startindex = 0;
            int [] f = new int [40];
            int maxm = Integer.MIN_VALUE;
            while(endindex<n){
                //grow window;
                 f[ar[endindex]]++;
                //shrink window
             while(f[ar[endindex]]>1  && startindex<=endindex){
                 f[ar[startindex]]--;
                 startindex++;
                    }
                    //ans calculate
                maxm = Math.max(maxm,endindex-startindex+1);
                endindex++;
            }

              System.out.println(maxm);
}

}