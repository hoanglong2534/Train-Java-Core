package CodeThieuNhi.TH1;

import java.util.Scanner;

public class b6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();

        System.out.println("Ket qua:");
        for(int i = 1 ; i <= 20 ; i++){
            int res = 0;
            res = n * i;
            System.out.print(res + " ");
        }
    }
}
