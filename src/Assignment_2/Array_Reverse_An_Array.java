package Assignment_2;
import java.util.*;
public class Array_Reverse_An_Array {
    public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];

   for(int i=0;i<arr.length;i++)
   {
    arr[i]=sc.nextInt();
   
   }
  
    for(int i=arr.length-1;i>=0;i--)
    {
       System.out.println(arr[i]+" ");
   }
 
   
    }


}