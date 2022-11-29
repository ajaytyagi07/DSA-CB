package Assignment_4;
import java.util.*;

public class Non_Repeating_Character {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            str = str.toLowerCase();
            int flag = 0;
            int[] a = new int[26];
            for (int i = 0; i < str.length(); i++) {
                a[str.charAt(i) - 97]++;
            }
            for (int i = 0; i < str.length(); i++) {
                if (a[str.charAt(i) - 97] == 1) {
                    flag = 1;
                    System.out.println(str.charAt(i));
                    break;
                }
            }
            if (flag == 0)
                System.out.println("-1");
        }
    }
}