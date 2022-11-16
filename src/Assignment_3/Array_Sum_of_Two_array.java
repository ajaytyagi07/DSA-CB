package Assignment_3;
import java.util.*;
public class Array_Sum_of_Two_array {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        for(int i = 0; i<a1.length;i++){
            a1[i]= sc.nextInt();

        } 
        int m = sc.nextInt();
         int[] a2 = new int[m];
        for(int i = 0; i<a2.length;i++){
            a2[i]= sc.nextInt();
            
        }
       int cry = 0;
		int i = a1.length - 1;
		int j = a2.length - 1;

		ArrayList<Integer> list = new ArrayList<>();

		while (i >= 0 || j >= 0) {

			int sum = 0;
			if (i >= 0) {
				sum += a1[i];
				i--;
			}
			if (j >= 0) {
				sum += a2[j];
				j--;
			}
			sum += cry;
			list.add(sum % 10);
			cry = sum / 10;

		}
        
		if (cry > 0) {
			list.add(cry);
		}

		for (int k = list.size() - 1; k >= 0; k--) {
            
			System.out.print(list.get(k) +","+ " ");
		}
        System.out.println("END");

       
    }
}
