package Assignment_2;
import java.util.*;
public class Square_ROOT {
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){

                long m = sc.nextLong();
                long lo = 1;
                long hi = m;
                long ans = 0;
                while(lo<=hi){

                    long mid =lo + (hi-lo)/2;
                    if(mid*mid <= m){
                        ans = mid;
                        lo = mid + 1;
                    }else{
                        hi = mid - 1;
                    }

                }

                double num = getFullNumber(ans , m);
                System.out.println(String.format("%.4f" , num));

            }
         

        }

        private static double getFullNumber(long ans , long m){

            double add = 0.1;
            double Answer = ans;
            for(int i=1;i<=4;i++){

                while(Answer * Answer <=m){
                    Answer += add;
                }

                Answer -= add;
                add/=10;
            }

            return Answer;
        }
}