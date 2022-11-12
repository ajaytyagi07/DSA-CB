package Assignment_1;
import java.util.*;
public class Print_Series {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        int s=0;
        for(int i=1,n=1;i<=N1;n++)
        {
            s=(3*n)+2;
            if(s%N2!=0)
            {
                System.out.println(s);
                i++;
            }
        }
    }
}
