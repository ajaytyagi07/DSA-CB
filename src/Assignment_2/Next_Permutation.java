package Assignment_2;
import java.util.*;
public class Next_Permutation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
		   int n = sc.nextInt();
		   int[] arr = new int[n];
		   for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
            NextPermutation(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

		}
	}

	public static void NextPermutation(int[] arr) {

		int a = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				a = i;
				break;
			}
		}

		int b = 0;
		for (int i = arr.length - 1; i > a; i--) {
			if (arr[i] > arr[a]) {
				b = i;
				break;
			}

		}
		if (a == 0 && b == 0) {
			Reverse(arr, 0, arr.length - 1);
			return;
		}

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		Reverse(arr, a + 1, arr.length - 1);

	}

	public static void Reverse(int[] arr, int i, int j) {
            while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

    }
}
