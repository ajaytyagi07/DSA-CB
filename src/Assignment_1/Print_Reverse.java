package Assignment_1;
import java.util.*;
public class Print_Reverse{
    public static void main(String args[]) {
        // Your Code Here
       
        int rem=0;
        int rev=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n = n/10;
        }
        
        System.out.println(rev);
    }
}
