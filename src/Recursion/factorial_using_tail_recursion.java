package Recursion;

import java.util.Scanner;

public class factorial_using_tail_recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fac(n , 1));
		
		}
	  public static int fac(int n, int ans) {
		  if(n==0) {
			  return ans;
		  }
			return fac(n-1, ans*n);
			
}
}