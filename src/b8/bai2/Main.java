
/*
Bài tập 2: Viết chương trình thực hiện các yêu cầu sau:

1. Khai báo 2 mảng colors và colors2 và thêm các phần tử cho 2 mảng đó.
2. Tạo mới 2 List list và list2 có các phần tử là phần tử của 2 mảng vừa khai báo.
3. Thêm các phần tử có trong list2 vào trong list, sau đó đưa list2 trở về 1 danh sách rỗng (không có phần tử nào)
    và hiển thị list.
4. Chuyển các phần tử có trong list thành ký tự in hoa và hiển thị lại list đó.
5. Xóa các phần tử trong list từ phần tử thứ 4 đến phần tử thứ 6. Hiển thị lại list sau khi xóa.
6. Đảo ngược list và hiển thị lại list sau khi đảo ngược.

 */

package b8.bai2;

import javax.print.CancelablePrintJob;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
        System.out.println("Nhap so phan tu cua mang colors: ");
        int n1 = sc.nextInt();
        System.out.println("Nhap so phan tu cua mang colors2: ");
        int n2 = sc.nextInt();
        String[] colors = new String[n1];
        String[] colors2 = new String[n2];
        System.out.println("Nhap cac phan tu cho mang colors: ");
        sc.nextLine();
        for (int i = 0; i < colors.length; i++) {
            colors[i] = sc.nextLine();
        }
        System.out.println("Nhap cac phan tu cho mang colors2: ");
        for (int i = 0; i < colors2.length; i++) {
            colors2[i] = sc.nextLine();
        }
        //2
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        for (int i = 0; i < n1; i++) {
            list.add(colors[i]);
        }
        for (int i = 0; i < n2; i++) {
            list2.add(colors2[i]);
        }

        //3
        for (int i = 0; i < list2.size(); i++) {
            String color = list2.get(i);
            list.add(color);
        }
        list2.clear();

        System.out.println("list sau khi them list 2: ");
        for (String x : list) {
            System.out.print(x + " ");
        }

        //4
        System.out.println();
        for(String x : list) {
           list.set(list.indexOf(x), x.toUpperCase());
        }
        System.out.println("Chuyen thanh in hoa: ");
        for (String x : list) {
            System.out.print(x +" ");
        }

        //5
        System.out.println();
        for(int i = 3 ; i <= 5 ; i++){
            list.remove(i);
        }
        System.out.println("List sau khi xoa: ");
        for (String x : list) {
            System.out.print(x +" ");
        }

        //6
        System.out.println();
        Collections.reverse(list);
        System.out.println("List sau khi dao nguoc: ");
        for (String x : list) {
            System.out.print(x +" ");
        }
    }
}
