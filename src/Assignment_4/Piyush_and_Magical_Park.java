package Assignment_4;
import java.util.*;
public class Piyush_and_Magical_Park {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int K = sc.nextInt();
		int S = sc.nextInt();
		char[][] ar = new char[M][N];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j] = sc.next().charAt(0);
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				if(S<K) {
					break;
				}

				if (ar[i][j] == '.') {
					S = S - 2;
				}
				if (ar[i][j] == '*') {
					S = S + 5;
				}
				if (ar[i][j] == '#') {
					break;
				}
				if (j < ar[0].length-1) {
					S--;
				}
			}
		}
		if(S>=K) {
			System.out.println("Yes");
			System.out.println(S);
		}
		else {
			System.out.println("No");
		}	
    }
}