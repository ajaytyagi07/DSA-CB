package Recursion;
import java.util.Scanner;

public class print_1to_n {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fun(n);
	}
	public static void fun (int n) {
		
		if (n==0) {
			
			return ;
		}	
		fun(n-1);
		System.out.println(n);
		
	}
	
	}