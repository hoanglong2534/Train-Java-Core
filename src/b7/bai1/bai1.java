
/*

Viết chương trình nhập vào 2 số thực. Bắt ngoại lệ để khi nhập vào không phải là số.
Cài đặt hàm chia, trong đó bắt ngoại lệ nếu số chia là 0 thì thông báo phép chia không hợp lệ và kết thúc chương trình.

 */
package b7.bai1;

import java.util.Scanner;

public class bai1 {

    static double  a, b;

    public static void nhap() throws NotANumberException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 2 so thuc: ");
        try{
            a = sc.nextDouble();
            b = sc.nextDouble();
        }catch (Exception e){
            throw new NotANumberException("Gia tri nhap vao phai la 1 so!");
        }
    }

    public static double chia(double a, double b) throws DevideZeroException {
       if(b == 0){
           throw new DevideZeroException("Mau so ko dc bang 0!");
       }
       return a / b;
    }

    public static void main(String[] args)  {

        try {
            nhap();
            System.out.println("Ket qua phep chia la: " + chia(a,b));
        } catch (NotANumberException e) {
            System.out.println(e.getMessage());
        }
        catch (DevideZeroException e) {
            System.out.println(e.getMessage());
        }

    }
}
