package Assignment_4;
import java.util.*;
public class Kartik_Bhaiya_And_Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int flipA = Maxlength(k,s, 'a');
        int flipB = Maxlength(k,s, 'b');
        System.out.println(Math.max(flipA,flipB));
    }
    public static int Maxlength(int k ,String s , char c){//b
        int Startindex = 0;
        int Endindex = 0;
        int ans = 0;
        int count = 0; //flip
        while(Endindex<s.length()){
          //window grow
          if(s.charAt(Endindex)==c){
            count++;
          }


          //window shrink
         while(count>k && Startindex<=Endindex){
             if(s.charAt(Startindex)==c){
                 count--;
             }
             Startindex++;
         }

          //ans calculate
          ans = Math.max(ans , Endindex-Startindex+1);
          Endindex++;
        }
          return ans;

  }
}