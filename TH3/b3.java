package CodeThieuNhi.TH3;

import java.util.Arrays;
import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = sc.nextInt();
        System.out.println("nhap gia tri:");
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("GTNN: " + a[0]);
    }
}
