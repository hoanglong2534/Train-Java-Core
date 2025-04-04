package CodeThieuNhi.TH1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class b4 {

    public static boolean check(double a, double b, double c) {
        double x = pow(a,2);
        double y = pow(b,2);
        double z = pow(c,2);
        if(x + y == z || y + z == x || x + z == y){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 so: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        if(check(a,b,c)){
            System.out.println("3 canh cua Tam giac vuong");
        }
        else{
            System.out.println("ko phai 3 canh Tam giac vuong");
        }
    }
}
