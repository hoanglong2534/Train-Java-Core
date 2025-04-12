
/*
Tạo một InvalidTriangleException bằng cách kế thừa lớp Exception.
Sử dụng Exception để phục vụ quá trình bắt lỗi trong quá trình khởi tạo đối tượng tam giác (Triangle),
nếu người dùng khởi tạo không đúng các cạnh của tam giác sẽ throw ra InvalidTriangleException

Cạnh tam giác không hợp lệ khi:
Giá trị cạnh < 0;
Giá trị cạnh là số quá lớn (xét trong giới hạn khoảng số nguyên).

 */

package b7.bai3;

import java.util.Scanner;

public class Bai3 {


    public static Triangle nhap() throws InvalidTriangleException {
        Scanner sc = new Scanner(System.in);
        Long canh1, canh2, canh3;
        System.out.print("nhap chieu dai canh 1: ");
        canh1 = sc.nextLong();
        System.out.print("nhap chieu dai canh 2: ");
        canh2 = sc.nextLong();
        System.out.print("nhap chieu dai canh 3: ");
        canh3 = sc.nextLong();

        if(canh1 < 0 || canh2 < 0 || canh3 < 0) {
            throw new InvalidTriangleException("Canh tam giac khong duoc am!");
        }
        if(canh1 > Integer.MAX_VALUE || canh2 > Integer.MAX_VALUE || canh3 > Integer.MAX_VALUE) {
            throw new InvalidTriangleException("Canh phai nam trong gioi han Integer!");
        }
        Triangle t = new Triangle(canh1, canh2, canh3);
        return t;
    }

    public static void main(String[] args) {

        try {
            Triangle triangle = nhap();
            System.out.println("Cac canh tam giac vua nhap:");
            System.out.println(triangle.getCanh1() + " " + triangle.getCanh2() + " " + triangle.getCanh3());
        } catch (InvalidTriangleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
