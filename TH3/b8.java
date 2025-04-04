package CodeThieuNhi.TH3;

import java.util.*;

public class b8 {

    public static void main(String[] args) {
        int[] cnt = new int[1000005];

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = sc.nextInt();
        System.out.println("nhap gia tri: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }


        Set<Integer> set = new TreeSet<>();
        for(int i = n - 1; i >= 0; i--){
           set.add(a[i]);

        }
        for(Integer x : set){
            System.out.println(x + " xuat hien " + cnt[x] + " lan") ;
        }

    }
}
