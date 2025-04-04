package CodeThieuNhi.TH3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class b7 {
    public static void main(String[] args) {

        int[] cnt=new int[1000005];

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        System.out.println("nhap gia tri: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        System.out.println("Phan tu chi xuat hien 2 lan: " );
        Set<Integer> set =  new HashSet<>();
        for(int i=0;i<n;i++){
            if(cnt[a[i]]==2){
               set.add(a[i]);
            }
        }
        for(int x: set){
            System.out.print(x + " ");
        }

    }
}
