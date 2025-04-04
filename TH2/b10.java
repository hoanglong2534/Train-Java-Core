package CodeThieuNhi.TH2;

import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum += i;
        }
        System.out.println("Tong tu 1 den " + n + ": " + sum);
    }
}
