package Assignment_1;
import java.util.*;
public class Odd_Even_back_in_Delhi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		    int a = sc.nextInt();
		    while (a > 0) {
			int n = sc.nextInt();
			int sumofodd = 0;
			int sumofeven = 0;
			while (n > 0) {
				int rem = n % 10;
				if (rem % 2 == 0) {
					sumofeven+= rem;
				} else {
			        sumofodd = sumofodd + rem;
				}
				n /= 10;

			}

			if (sumofeven % 4 == 0 || sumofodd % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			a--;
		
            }
    }
}