package Basicmaths;
import java.util.*;
public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int n1 =num1;
        int n2 =num2;

        while(num1%num2!=0){
            int rem=num1%num2;
            num1 = num2;
            num2 = rem;
        }
        System.out.println(num2);
        
        int gcd =num2;

        int lcm = (n1*n2)/gcd;
        System.out.println(lcm);
        sc.close();
    }
}
