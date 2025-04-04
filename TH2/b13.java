package CodeThieuNhi.TH2;

import java.util.Scanner;

public class b13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        double a = sc.nextInt();
        System.out.println("nhap b");
        double b = sc.nextInt();

        if(a != 0){
            System.out.println("PT co nghiem: " + String.format("%.2f", -b/a));
        }
        else if(b != 0){
            System.out.println("PT vo nghiem");
        }
        else if(b == 0){
            System.out.println("PT vo so nghiem");
        }
    }
}
