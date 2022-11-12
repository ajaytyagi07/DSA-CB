package Assignment_2;
import java.util.*;
public class Squares_of_Sorted_Array {
    public static void main (String args[]) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];

   for(int i=0;i<arr.length;i++)
   {
    arr[i]=sc.nextInt();
    arr[i]=arr[i]*arr[i];
    if(arr[i]<0){
        arr[i]=arr[i]*arr[i];
   
    }
   }
   int temp;
   for(int r=1;r<(arr.length-1);r++)
   {
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]>arr[i+1])
        {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
   }
   for(int i=0;i<arr.length;i++)
   {
   System.out.print(arr[i] +" ");
    }


    
}
}
