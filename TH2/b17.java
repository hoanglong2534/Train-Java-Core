package CodeThieuNhi.TH2;

import java.util.Scanner;

public class b17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap string:");
        String s = sc.nextLine();

        int cnt = 0;
        for(int i = 0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                cnt++;
            }
        }
        System.out.println("So ki tu la chu so: " + cnt);
    }
}
