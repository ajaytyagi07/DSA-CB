package Assignment_4;
import java.util.*;
public class Average_of_sliding_window {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int n = sc.nextInt();
            if(n == -1)
                break;
            list.add(n);
        }
        int i = 0;
        int k = 0;
        int s = 0;
        while (k < list.size()) {
            s += list.get(k);
            System.out.format("%.4f ", ((float)(s)/(k-i+1)));
            if (k-i+1 < m) {
                k++;
            } 
            else {
                s -= list.get(i);
                i++;
                k++;
            }
        }
    }
}