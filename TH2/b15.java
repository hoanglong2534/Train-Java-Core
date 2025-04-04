package CodeThieuNhi.TH2;

import java.util.Scanner;

public class b15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 300; i>= 3; i--){
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
