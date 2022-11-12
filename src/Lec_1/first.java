package Lec_1;

public class first {
	public static void main(String[]args) {
 /* System.out.println("Hello world");
	System.out.print("hii");
	System.out.println("ajay");  */
		
	int a =-5;
	int b = 6;
	int c= a%b;
	System.out.println(c);
	
	int a1 = 5;
	System.out.println(a++);	
	System.out.println(a);
	int x = 11;
	b = x--;
	System.out.println(b);
	
	int p = 5 + a++ - x-- -a + a++;
	System.out.println(p);
	
	int k = 77;
	System.out.println(--k);
	a = 5;
	x = 4;
	int n = a++ + ++a - --x + --x+ ++x;
	System.out.println(n);
		
	}
}
