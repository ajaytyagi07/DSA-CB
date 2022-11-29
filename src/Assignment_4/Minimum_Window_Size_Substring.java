package Assignment_4;
import java.util.*;
public class Minimum_Window_Size_Substring {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String t1 = sc.next();
        System.out.println(MinimumWindow(s1,t1));
    }
        public static String MinimumWindow(String s, String t){
        int[] Freq = new int[123];
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            Freq[c]++;
        }
        int[] Freqs = new int[123];
        int startindex = 0;
        int endindex = 0;
        int l = Integer.MAX_VALUE;
        int count = 0;
        int start = -1;
        while (endindex < s.length()) {
            // window grow
            char c = s.charAt(endindex);
            Freqs[c]++;
            if (Freq[c] >= Freqs[c]) {
                count++;
            }
            // window shrink
            if (count == t.length()) {
                while (Freqs[s.charAt(startindex)] > Freq[s.charAt(startindex)] && startindex <= endindex) {
                    Freqs[s.charAt(startindex)]--;
                    startindex++;
                }
                // ans calculate
                if (l > endindex - startindex + 1) {
                    l = endindex - startindex + 1;
                    start = startindex;
                }
            }
            endindex++;
        }
        if (start == -1) {
           // System.out.println("");
           return "";
        }
       // System.out.println(s.substring(start, start + l));
       return s.substring(start, start + l);
    }
}