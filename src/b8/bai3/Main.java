/*
Viết chương trình thực hiện các yêu cầu sau:
- Khai báo 1 Set có Class triển khai là HashSet, kiểu dữ liệu là String.
  Sau đó thêm vào phần tử là tên của các khoa của một trường đại học cho Set này
  (giá trị của các phần tử được nhập từ bàn phím).
- Hiển thị các phần tử vừa nhập có trong Set vừa nhập sử dụng Iterator.
- Thêm vào một khoa mới vào trong Set, nếu tên khoa đó đã tồn tại thì
    thông báo cho người dùng biết tên khoa đó đã có, còn ngược lại thêm
	bình thường và thông báo "Thêm thành công!".
- Xóa một khoa bất kỳ ra khỏi Set. Kiểm tra nếu khoa cần xóa có tồn tại
    trong Set thì mới xóa và thông báo "Xóa thành công!",
    ngược lại thông báo "Xóa không thành công!".

 */

package b8.bai3;

import b7.bai1.NotANumberException;

import java.util.*;

public class Main {
    public static void main(String[] args) throws NotANumberException {
        Scanner sc = new Scanner(System.in);
        Set<String> se = new LinkedHashSet<>();
        System.out.println("Nhap ten cac khoa vao Set: ");

        while(true) {
            String x = sc.nextLine();
            if(x.equals("done")) {
                break;
            }
            else{
                se.add(x);
            }
        }

        System.out.println("Cac khoa da nhap: ");
        Iterator<String> it = se.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
        System.out.println("Nhap vao 1 khoa de them: ");
        String tmp = sc.nextLine();
        if(se.contains(tmp)) {
            System.out.println("Khoa da ton tai, ko them duoc!");
        } else{
            se.add(tmp);
            System.out.println("Them thanh cong!");
        }
        System.out.println("Danh sach khoa sau khi them:");
        for(String x : se) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("nhap ten khoa can xoa: ");
        String tmp2 = sc.nextLine();
        if(!se.contains(tmp2)) {
            System.out.println("Xoa khong thanh cong!");
        }
        else{
            se.remove(tmp2);
        }
        System.out.println("Danh sach khoa sau khi xoa: ");
        for(String x : se) {
            System.out.print(x + " ");
        }

    }
}
