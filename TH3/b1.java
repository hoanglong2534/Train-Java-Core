package CodeThieuNhi.TH3;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("nhap mang:");
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum+=a[i];
        }
        System.out.println("gia tri trung binh: " + sum/n);
    }
}
