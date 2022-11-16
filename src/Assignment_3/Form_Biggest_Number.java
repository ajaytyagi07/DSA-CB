package Assignment_3;
import java.util.*;
public class Form_Biggest_Number {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
            int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
        
	    	REVERSE(a);
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
				
			}
			System.out.println();
		}

	}
     
	public static void REVERSE(int[] a) { //sort

		
		for (int r = 1; r < a.length; r++) {

			for (int i = 0; i < a.length - r; i++) {

				if (comp(a[i], a[i + 1]) > 0) {

					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;

				}

			}

		}

	}

	public static int comp(int x, int y) {

		 String S1 = "" + x + y;
		 String S2 = "" + y + x;

	if (Long.parseLong(S2) > Long.parseLong(S1)) {

			return 1;

		}
         else {

			return -1;

		}


    }
}
