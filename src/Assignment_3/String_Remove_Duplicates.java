package Assignment_3;
import java.util.*;
public class String_Remove_Duplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + " ";
       
        int c = 0;
        
        char a = ' ', b =' ';
        b = s.charAt(0);


        for(int i=0;i<s.length();i++)
        {
            a = s.charAt(i);
           
            if(a == b)
            {
                c++;                
            }

            if(a != b)
            {
                System.out.print(s.charAt(i-1));
                c = 1;
            }
            b = a;
        }

    }
}
Clo