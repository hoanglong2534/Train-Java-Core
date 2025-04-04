package CodeThieuNhi.TH2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class b18 {

    public static void tach(String s) {
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap String: ");
        String s = sc.nextLine();

        tach(s);
    }
}
