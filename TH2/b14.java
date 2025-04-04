package CodeThieuNhi.TH2;

import java.util.Scanner;

public class b14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen");
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("ZERO");
        }
        else if(n%2==0){
            System.out.println("so chan");
        }
        else{
            System.out.println("so le");
        }
    }
}
