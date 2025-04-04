package CodeThieuNhi.TH3;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a , b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("PT Vo nghiem");
        }
        else if (delta == 0) {
            System.out.println("PT co nghiem kep: " + (-b/2*a));
        }
        else{
            double n1 = (-b + sqrt(delta))/(2*a);
            double n2 = (-b - sqrt(delta))/(2*a);
            System.out.println("PT co 2 nghiem phan biet: " + n1 + "  " + n2);
        }
    }
}
