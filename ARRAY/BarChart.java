//REVISE


package ARRAY;
import java.util.*;
public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[]= new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++){
            if (a[i]>max) {
                max=a[i];
            }
        }

        for(int floor=max;floor>=1;floor--){
            for(int i=0;i<a.length;i++){
                if (a[i]>=floor) {
                    System.out.print("*\t");
                }else{
                    System.out.println("\t");
                }
            }
            System.out.println();
        }
    }
}
