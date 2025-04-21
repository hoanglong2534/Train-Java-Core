
/*
Tạo file exercise1.java, sử dụng ArrayList (import java.util), thực hiện các công việc sau:
Thêm vào ArrayList 1 số nguyên
Thêm vào ArrayList 1 số thực
Thêm vào ArrayList 1 giá trị Boolean
Thêm vào ArrayList 1 xâu ký tự
In ra màn hình 4 giá trị trên từ ArrayList

 */
package b10.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList<>();

        System.out.print("nhap vao so nguyen: ");
        int num = sc.nextInt();

        System.out.print("nhap vao so thuc: ");
        double numR = sc.nextDouble();

        System.out.print("nhap vao mot gia tri boolean: ");
        Boolean check = sc.nextBoolean();

        System.out.print("nhap vao mot chuoi: ");
        sc.nextLine();
        String string  = sc.nextLine();

        list.add(num);
        list.add(numR);
        list.add(check);
        list.add(string);

        System.out.println("cac gia tri trong list:");
        for(Object obj : list) {
            System.out.print(obj + " ");
        }
    }
}
