package Assignment_4;
import java.util.*;

class Length_of_longest_substring_without_repeating_characters {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length(); 
        int Long = 0;
        int[] ni = new int[128];
        for (int i = 0, len = 0; i < n; i++) {
            len = Math.max(ni[s.charAt(i)], len);
            Long = Math.max(Long, i - len + 1);
            ni[s.charAt(i)] = i + 1;
        }

      System.out.println(Long);
    }

   
}
