package CodeThieuNhi.TH1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        // nhap n > 0
        int n = sc.nextInt();

        String s = "" + n;

        List<String> l1 = new ArrayList<>();
        l1.add("Một");
        l1.add("Hai");
        l1.add("Ba");
        l1.add("Bốn");
        l1.add("Năm");
        l1.add("Sáu");
        l1.add("Bảy");
        l1.add("Tám");
        l1.add("Chín");

        switch (s.length()) {
            case 1:
                System.out.println(l1.get(n - 1));
                break;
            case 2:
                if (n < 20) {
                    System.out.print("Mười ");
                    int tmp = n % 10;
                    System.out.println(l1.get(tmp - 1));
                } else {
                    int x = n / 10;
                    int y = n % 10;
                    System.out.println(l1.get(x - 1) + " Mươi " + l1.get(y - 1));
                }
                break;
        }

    }
}
