package CodeThieuNhi.TH2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class b19 {

    public static boolean nt(int n) {
        if (n < 2) return false;
        for(int i = 2;  i <= sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so: ");
        int n = sc.nextInt();

        if(nt(n)){
            System.out.println("n la so nguyen to");
        }else{
            System.out.println("n ko phai la so nguyen to");
        }
    }
}
