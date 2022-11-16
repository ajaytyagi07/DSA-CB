package Assignment_3;
import java.util.*;
public class Change_element_2D_Matrix {
 public static  void ZERO(int a[][],int i,int j)
    {
       for(int k = 0; k<a[0].length; k++)
       {
         a[i][k] = 0;
       }
    }
    public static void main (String args[]) {
       Scanner sc = new Scanner(System.in);
       int M = sc.nextInt();
       int N = sc.nextInt();
       int a[][] = new int[M][N];

      for(int i=0; i<M; i++)
      {
          for(int j=0; j<N; j++)
          {
              a[i][j] = sc.nextInt();
          }
      }
     String col="";
      for(int i=0; i<M; i++)
      {
          for(int j=0; j<N; j++)
          {
              if(a[i][j] == 0)
              {
                  ZERO(a, i, j);
                  col += j;
                  break;
              }
          }
      }

       for(int i=0; i<col.length(); i++)
       {
           for(int k=0; k<a.length; k++)
           {
               a[k][(int)(col.charAt(i)-'0')] = 0;
           }
        }
      for(int i=0; i<M; i++)
      {
          for(int j=0; j<N; j++)
          {
             System.out.print(a[i][j]+" ");
          }
          System.out.println();
      }
    }
}
