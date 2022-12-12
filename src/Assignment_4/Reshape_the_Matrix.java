package Assignment_4;
import java.util.*;
public class Reshape_the_Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int a[][] = new int[M][N];
        int a1[] = new int[M*N];
        int in = 0;
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                a[i][j] = sc.nextInt();
                a1[in++] = a[i][j];
            }
        }
        int R = sc.nextInt();
        int C = sc.nextInt();
        int x = 0;
         if ((R*C)==(M*N)) {
            for (int i=0; i<R; i++) {
                for (int j=0; j<C; j++) {
                    System.out.print(a1[x++] + " ");
                }
                System.out.println();
            }
        } 
        else {
            for (int i=0; i<M; i++) {
                for (int j=0; j<N; j++) {
                     System.out.print(a[i][j]+" ");
                }
            System.out.println();
            }
        }
    }
}
