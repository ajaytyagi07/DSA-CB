package Assignment_3;
import java.util.*;
public class Strings_Toggle_case{
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String c = "";
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				c = c + (char)(ch+32);
			}
			else {
				c = c + (char)(ch-32);
			}

		}
		System.out.println(c);
    }
}
