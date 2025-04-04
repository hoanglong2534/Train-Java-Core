package CodeThieuNhi.TH2;

import java.util.Scanner;

public class b11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        if(n % 2 == 0){
            for(int i = 1; i <= n; i+= 2){
                sum += i;
            }
        }
        else{
            for(int i = 2; i <= n; i+= 2){
                sum += i;
            }
        }
        System.out.println("Tong: " + sum);
    }
}
