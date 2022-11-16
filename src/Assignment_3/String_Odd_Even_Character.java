package Assignment_3;
import java.util.*;
public class String_Odd_Even_Character {
    public static void main(String args[]) {
        // Your Code Here
       Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String c ="";
		for (int i = 0; i <s.length(); i++) {
		   char ch = s.charAt(i);

			if(i%2==0) {
				c = c+(char)(ch+1);
			}
			else {
				c = c+(char)(ch-1);
			}
			
		}
        
		System.out.println(c);
    }
}
