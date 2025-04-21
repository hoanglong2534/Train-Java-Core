
/*
Tạo file exercise2.java, sử dụng ArrayList (import java.util), thực hiện các công việc sau:
Generic ArrayList là kiểu Integer (ArrayList<Integer> myarrr = new ArrayList<Integer>();)
Sử dụng vòng lặp để nhập các số từ 1 đến 10 vào mảng myarrr trên
Sử dụng vòng lặp để hiển thị các số từ 1 đến 10 từ mảng myarrr.
 */

package b10.bai2;

import java.util.ArrayList;


public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> myarr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myarr.add(i + 1);
        }
        System.out.println("cac so trong myarr");
        for (int i = 0; i < 10; i++) {
            System.out.print(myarr.get(i) + " ");
        }
    }
}
