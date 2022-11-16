package Assignment_3;
import java.util.*;
public class String_Max_Frequency_character {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
	    int [] ch = new int [26];
		 for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			ch[c-97] = ch[c-97]+1;
		}
		int max = 0;
		 for (int i = 1; i < ch.length; i++) {
			if(ch[i] > ch[max]) {
				max = i;
			}
		}
		 char c = (char)(97 + max);

		System.out.println(c);
		
    }
}
