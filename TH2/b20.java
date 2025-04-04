package CodeThieuNhi.TH2;

import java.util.Scanner;

public class b20 {

    public static long ucln(long a, long b) {
       while (b != 0) {
           long r = a % b;
           a = b;
           b = r;
       }
       return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 2 so: ");
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println("UCLN: " + ucln(a, b));
    }
}
