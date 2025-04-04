package CodeThieuNhi.TH2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class b24 {

    static long[] f = new long[100];
    public static void fibo() {
        f[0] = 1;
        f[1] = 1;
        for(int i = 2; i < 93; i++) {
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static void main(String[] args) {
        fibo();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.print(f[i-1] + " ");
        }
    }
}
