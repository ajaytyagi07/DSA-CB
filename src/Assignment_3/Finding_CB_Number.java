package Assignment_3;
import java.util.*;
public class Finding_CB_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        s = sc.nextLine();
		int count = 0;

		boolean[] visit = new boolean[s.length()];
		for(int l=1;l<=s.length();l++) {
			for(int j=l; j<=s.length(); j++) {
			int i = j-l;
			String s1 = s.substring(i,j);
			long m = Long.parseLong(s1);
			if(iscbnumber(m) == true && isvisit(visit, i, j-1)) {
					count++;

				for(int k = i; k <= j-1; k++) {
						visit[k] = true;
					}
				}
			}
		}
        System.out.println(count);
	}
    public static boolean isvisit(boolean[] visit, int i, int j) {
		for(int k = i; k<=j; k++) {
			if(visit[k] == true) {
				return false;
			}
		}
		return true;
	}


    public static boolean iscbnumber(long val) {
		if(val == 0 || val == 1) {
			return false;
		}
		int[] array = {2,3,5,7,11,13,17,19,23,29};
		for(int i=0; i<array.length; i++) {
			if(val == array[i]) {
				return true;
			}
		}
		for(int i=0; i<array.length; i++) {
			if(val% array[i] == 0) {
				return false;
			}
		}
		return true;
	}
	
}
