package CodeThieuNhi.TH2;

import java.util.Scanner;

public class b16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap String: ");
        String s = sc.nextLine();
        int cnt = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                cnt ++;
            }
        }
        System.out.println("so lan a xuat hien: " + cnt);
    }
}
