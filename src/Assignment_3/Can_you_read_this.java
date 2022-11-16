package Assignment_3;
import java.util.*;
public class Can_you_read_this {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
	String s = sc.next();
	read(s);

	}

	public static void read(String s) {
		String word = "";
		word = word + s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				System.out.println(word);
				word = "";
				word = word + ch;
			} else {
				word = word + ch;
			}

		}
		System.out.println(word);

	}

}