package Assignment_2;
import java.util.*;
public class Pair_Of_Roses {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
           
           for(int i=0; i<arr.length; i++)
            {
                arr[i]=sc.nextInt();
            }

            int m = sc.nextInt();
            Arrays.sort(arr);

            int a =0;
            int b = arr.length-1;

            int diff = Integer.MAX_VALUE;
            int x=0, y=0;
            
            while(a<b)
            {
                if(arr[a]+arr[b]==m){
                 if(diff>(arr[b]-arr[a]))
                   {
                       diff=arr[b]-arr[a];
                       x=arr[a];
                       y=arr[b];
                   }
                a++;
                b--;
                }
                else if(arr[a]+arr[b]>m)
                b--;
                else if(arr[a]+arr[b]<m)
                a++;
            }
             System.out.println("Deepak should buy roses whose prices are "+x+" and "+y+".");
        }

    }
}
