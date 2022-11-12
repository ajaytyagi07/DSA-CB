package Assignment_1;
import java.util.*;
public class Conversion_Any_To_Any{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int sb=sc.nextInt();
        int db=sc.nextInt();
        int sn=sc.nextInt();
    
        int mul=1,rem=0,p=0,sum=sn;
        while(sum!=0)
        {
            rem=sum%10;
            p=p+rem*mul;
            sum=sum/10;
            mul=mul*sb;
        }
        
        int n=p;
        mul=1;
        rem=0;
        int bin=0;
        while(n!=0)
        {
            rem=n%db;
            bin=bin+mul*rem;
            n=n/db;
            mul=mul*10;
        }
        System.out.println(bin);
    }
}