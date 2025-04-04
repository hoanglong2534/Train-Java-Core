package CodeThieuNhi.TH2;

import java.util.Arrays;
import java.util.Scanner;

public class b12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong gia tri: ");
        int n = sc.nextInt();
        System.out.println("nhap cac gia tri:");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("GTLN: " + a[n - 1]);
        System.out.println("GTNN: " + a[0]);

    }
}
