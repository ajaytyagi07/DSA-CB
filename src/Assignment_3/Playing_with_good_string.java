package Assignment_3;
import java.util.*;
public class Playing_with_good_string {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(GoodString(s));

    }
    public static int GoodString(String s){
      int str = 0;
      int count = 0;
      for(int i =0; i<s.length();i++){
          char ch =s.charAt(i);
          if(vowel(ch)==true){
              count++;
          }
          else{
              str = Math.max(str,count);
              count = 0;
          }

      }
         str = Math.max(str,count);
         return str;
      

    }
    public static boolean vowel(char ch){
        if(ch =='a'|| ch == 'e'|| ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
            return false;
    }
}
