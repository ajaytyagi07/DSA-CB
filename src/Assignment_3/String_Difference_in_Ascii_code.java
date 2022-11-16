package Assignment_3;
import java.util.*;
public class String_Difference_in_Ascii_code {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans="";
		char a= s.charAt(0);
		for (int i =1; i < s.length(); i++) {
			char c= s.charAt(i);
			ans = ans + a +(c-a);
		     a=c;
		
		}
		ans = ans + a;
		System.out.println(ans);
    }
}