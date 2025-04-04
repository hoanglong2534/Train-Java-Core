package CodeThieuNhi.TH3;

import java.util.Scanner;

public class b4 {

    public static int gt(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = sc.nextInt();
        System.out.println("giai thua la: " + gt(n));
    }
}
