
/*
Bài tập 1: Viết chương trình thực hiện các yêu cầu sau:

1. Khai báo 1 List có Class triển khai là ArrayList, kiểu dữ liệu là String.
    Sau đó thêm vào phần tử là các thứ trong tuần cho List này (giá trị của các phần tử được nhập từ bàn phím).
2. Hiển thị các phần tử có trong List vừa nhập bằng 2 cách: sử dụng Iterator và ListIterator.
3. Thay đổi phần tử bất kỳ trong List và hiển thị lại List sau khi thay đổi.
4. Xóa phần tử vừa thay đổi trong List và hiển thị lại các phần tử còn lại của List.
5. Hiển thị các phần tử của List theo thứ tự từ phần tử cuối trở về phần tử đầu tiên.

 */

package b8.bai1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
        List<String> a = new ArrayList<String>();

        for(int i = 1 ; i <= 7 ; i++){
            String day = sc.nextLine();
            a.add(day);
        }

        //2
         //Cach1: Iterator
        Iterator<String> it = a.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

    }
}
