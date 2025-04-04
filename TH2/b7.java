package CodeThieuNhi.TH2;

import java.util.Scanner;

public class b7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0 ; i <= 18; i +=2){
            sum += i;
        }
        System.out.println(sum);
    }
}
