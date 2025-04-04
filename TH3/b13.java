package CodeThieuNhi.TH3;

import javax.lang.model.type.IntersectionType;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class b13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap kich thuoc 2 mang; ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        Set<Integer> se = new TreeSet<>();

        System.out.println("nhap gia tri mang 1");
        int[] a = new int[m];
        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt();
            se.add(a[i]);
        }
        System.out.println("nhap gia tri mang 2");
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
            se.add(b[i]);
        }
        System.out.println("Hop 2 mang: ");
        for(Integer x : se){
            System.out.print(x + " ");
        }

     }
}
