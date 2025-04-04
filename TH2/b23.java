package CodeThieuNhi.TH2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class b23 {

    static int[] p = new int[1000005];

    public static void sang() {
        for (int i = 0; i < 1000005; i++) {
            p[i] = 1;
        }
        p[0] = p[1] = 0;
        for (int i = 2; i < sqrt(1000005); i++) {
            if (p[i] == 1) {
                for (int j = i * i; j < 1000005; j += i) {
                    p[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        sang();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = sc.nextInt();

        int cnt = 0;
        for(int i = 2; i <= 1000005 && cnt < n ; i++) {
            if(p[i] == 1) {
                System.out.print(i + " ");
                cnt++;
            }
        }
    }
}
