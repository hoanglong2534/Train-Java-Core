package CodeThieuNhi.TH1;

import java.util.Scanner;

public class b5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();

        int s = 0;
        for(int i = 0; i <= n ; i+=2){
            s += i;
        }
        System.out.println("Tong cac so chan: " + s);

    }
}
