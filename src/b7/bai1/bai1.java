
/*

Viết chương trình nhập vào 2 số thực. Bắt ngoại lệ để khi nhập vào không phải là số.
Cài đặt hàm chia, trong đó bắt ngoại lệ nếu số chia là 0 thì thông báo phép chia không hợp lệ và kết thúc chương trình.

 */
package b7.bai1;

import java.util.Scanner;

public class Bai1 {

    public static Input nhap() throws NotANumberException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 2 so thuc: ");
        double a, b;
        try {
            a = sc.nextDouble();
            b = sc.nextDouble();
        } catch (Exception e) {
            throw new NotANumberException("Gia tri nhap vao phai la 1 so!");
        }
        Input input = new Input(a, b);
        return input;
    }

    public static double chia(Input input) throws DevideZeroException {
        if (input.getB() == 0) {
            throw new DevideZeroException("Mau so ko dc bang 0!");
        }
        return input.getA()/input.getB();
    }

    public static void main(String[] args) {

        try {
            Input input = nhap();
            System.out.println("Ket qua phep chia la: " + chia(input));
        } catch (NotANumberException | DevideZeroException e) {
            System.out.println(e.getMessage());
        }

    }
}
