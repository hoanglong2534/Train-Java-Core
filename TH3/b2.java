package CodeThieuNhi.TH3;

import java.util.*;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("nhap gia tri:");
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("GTLN: " + a[n-1]);

    }
}
