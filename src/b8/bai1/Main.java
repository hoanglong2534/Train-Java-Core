
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

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
        List<String> a = new ArrayList<String>();
        System.out.println("Nhap cac ngay trong tuan: ");
        for(int i = 1 ; i <= 7 ; i++){
            String day = sc.nextLine();
            a.add(day);
        }

        //2
         //Cach1: Iterator
        Iterator<String> it = a.iterator();
        System.out.print("Iterator: ");
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
            // cach2: List Iterator
        ListIterator<String> lit = a.listIterator();
        System.out.print("ListIterator: ");
        while(lit.hasNext()){
            System.out.print(lit.next() + " ");
        }

        //3
        System.out.println();
        System.out.println("Nhap vi tri phan tu muon thay doi: ");
        int pos = sc.nextInt();
        System.out.println("Thay doi phan tu thanh: ");
        sc.nextLine();
        a.set(pos - 1, sc.nextLine());
        System.out.println("List sau khi thay doi:");
        for(String x : a){
            System.out.print(x + " ");
        }

        //4
        System.out.println();
        a.remove(pos - 1);
        System.out.println("Cac phan tu con lai:");
        for(String x : a){
            System.out.print(x + " ");
        }

        //5
        System.out.println();
        System.out.println("List khi duyet nguoc: ");
        for(int i = a.size() - 1 ; i >= 0 ; i--){
            System.out.print(a.get(i) + " ");
        }
    }
}
