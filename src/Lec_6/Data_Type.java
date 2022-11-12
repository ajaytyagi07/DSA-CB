package Lec_6;
import java.util.Scanner;
public class Data_Type {
	public static void main(String[] args) {
	byte b = (byte)(128);
	int i=10;
	long l= 10;
	short s= 10;
	b=(byte)(i);
	System.out.println(b);
	//System.out.print(Integer.toBinaryString(i:428));
	l=s;
	l=1000_000_000l;
	System.out.println(l);
	Scanner sc =new Scanner(System.in);
	b=sc.nextByte();
	i=sc.nextInt();
	l=sc.nextLong();
	System.out.println(b);
	System.out.println(i);
	System.out.println(l);
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);
	
	
	

}
}
