package CodeThieuNhi.TH2;

import java.util.Scanner;

public class b9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 7 == 0){
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
