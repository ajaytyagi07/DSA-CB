package Assignment_2;
import java.util.*;
public class Help_Ramu{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {

			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];

			for (int i = 0; i < a.length; i++) 
            {
				a[i] = sc.nextInt();
			}

			for (int i = 0; i < b.length; i++) 
            {
				b[i] = sc.nextInt();
			}

			int rickshaw_ride = 0;
			int cab_ride = 0;
			for (int i = 0; i < a.length; i++)
             {
				rickshaw_ride += Math.min(a[i]*c1, c2);

			}

			for (int i = 0; i < b.length; i++)
             {
				cab_ride += Math.min(b[i]*c1, c2);

			}
			rickshaw_ride = Math.min(rickshaw_ride, c3);
			cab_ride = Math.min(cab_ride, c3);
            
			int num = Math.min(c4, cab_ride + rickshaw_ride);
			System.out.println(num);

		}


    }
}