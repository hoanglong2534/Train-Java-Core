package CodeThieuNhi.TH1;

import java.util.Scanner;

public class b1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int n = sc.nextInt();
        if(n >= 0) System.out.println("Đây là số nguyên dương");
        else System.out.println("Đây là số nguyên âm");
    }
}
