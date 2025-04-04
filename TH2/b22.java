package CodeThieuNhi.TH2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class b22 {
    public static boolean nt(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 2; i < n ; i++){
            if(nt(i)){
                sum += i;
            }
        }
        System.out.println("tong cac so ngto nho hon n: "  + sum);
    }
}
