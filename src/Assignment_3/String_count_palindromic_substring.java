package Assignment_3;
import java.util.*;
public class String_count_palindromic_substring {
    public static void main(String args[]) {
        // Your Code Here
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(SubString(s));



    }
    public static int SubString(String s){
        int count = 0;
        for(int i =0; i<s.length();i++){
            for(int j = i+1; j<=s.length();j++){
                String s1=s.substring(i,j);
                if(ispalindrome(s1) ==true ){

                   count++;
                
                }
              
            }
          
        }       
          return count;
    }
    public static boolean ispalindrome(String s2){
        int i = 0;
        int j = s2.length()-1;
     
        while(i<j){
            if(s2.charAt(i)!= s2.charAt(j))
            return false;
            i++;
            j--;
        }
 
        return true;
       
    }

}
