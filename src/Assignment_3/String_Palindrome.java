package Assignment_3;
import java.util.*;
public class String_Palindrome {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
		System.out.println(ispalindrome(s));

	}

	public static boolean ispalindrome(String s) {

		int n = 0;
		int m = s.length() - 1;
		while (n < m) {
			if (s.charAt(n) != s.charAt(m)) {
				return false;
			}
			n++;
			m--;
		}
		return true;
    }
}