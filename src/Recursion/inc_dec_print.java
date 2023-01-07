package Recursion;

import java.util.Scanner;

public class inc_dec_print {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fun(n);
	}
	public static void fun (int n) {
		
		if (n==0) {
			
			return ;
		}	
		System.out.println(n);
		fun(n-1);
		System.out.println(n);
		
	}
}
