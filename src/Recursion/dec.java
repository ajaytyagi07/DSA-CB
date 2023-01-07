package Recursion;
import java.util.Scanner;

public class dec {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dec(n);
	}
	public static void dec (int n) {
		
		if (n==0) {
			
			return ;
		}	
		
		System.out.println(n);
		dec(n-1);
	}
	
	}
