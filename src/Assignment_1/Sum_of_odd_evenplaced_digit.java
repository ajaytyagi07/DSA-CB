package Assignment_1;

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=a;
        int even=0;
        int odd=0;
        for(int i=1;n>0;i++)
        {
            if(i%2==0)
                even=even+n%10;
            else
                odd=odd+n%10;
            n=n/10;
        }
        System.out.println(odd);
        System.out.println(even);


    }
}
