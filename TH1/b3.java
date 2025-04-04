package CodeThieuNhi.TH1;

import java.util.Scanner;

public class b3 {

    public static boolean check(int a, int b, int c){
        if(a + b > c && a + c > b && b + c > a){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 so: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(check(a,b,c)){
            System.out.println("3 canh cua tam giac");
        }
        else{
            System.out.println("Ko phai 3 canh cua tam giac");
        }
    }
}
