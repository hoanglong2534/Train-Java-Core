
/*
Khai báo 1 mảng có n phần tử các số nguyên, viết hàm nhập các phần tử cho mảng.
Bắt ngoại lệ nếu nhập phần từ có giá trị là 100 thì in ra các phần tử đã nhập và kết thúc chương trình.
 */

package b7.bai2;

import java.util.Scanner;

public class bai2 {

    static int pos = -1;

    public static void nhap(int[] a, int n) throws Value100Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 100) {
                pos = i - 1;
                throw new Value100Exception("Khong duoc nhap gia tri la 100!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac gia tri cua mang:");
        try {
            nhap(a, n);
            System.out.println("Cac phan tu cua mang:");
            for(int i = 0 ; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        } catch (Value100Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Cac phan tu da nhap:");
            for(int i = 0 ; i <= pos; i++) {
                System.out.print(a[i] + " ");
            }
        }

    }
}
