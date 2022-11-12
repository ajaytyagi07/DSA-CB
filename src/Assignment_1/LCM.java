package Assignment_1;
import java.util.*;
public class LCM {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
        int gcd = 1;
        for(int i = 1; i <= N1 && i <= N2; ++i) 
        {
            
            if(N1 % i == 0 && N2 % i == 0)
            gcd = i;
        }
        int Lcm = (N1 * N2) / gcd;
        System.out.println(Lcm);
        

		
    }
}