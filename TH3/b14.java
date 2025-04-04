package CodeThieuNhi.TH3;

import java.util.*;

public class b14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        System.out.println("nhap gia tri: ");
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i++){
            list.add(sc.nextInt());
        }
        //a: Tìm phần tử lớn thứ nhất và lớn thứ 2 trong mảng với các chỉ số của chúng (chỉ số đầu
        //tiên tìm được).
        Collections.sort(list);
        System.out.println("phan tu lon thu nhat: " + list.get(n-1) + " chi so " + (n-1));
        System.out.println("phan tu lon thu hai: " + list.get(n-2)  + " chi so " + (n-2));

        //b: Sắp xếp mảng theo thứ tự tăng dần.
        System.out.println("Mang sap xep tang dan:");
        for (int i = 0; i < n; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // c:
        System.out.println("nhap so can chen: ");
        int x = sc.nextInt();
        int pos = n ;

        for (int i = 0; i < n; i++) {
            if(list.get(i) > x){
                pos = i ;
                break;
            }
        }

        for(int i = 0 ; i < pos ; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.print(x + " ");
        for(int i = pos; i < n ; i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
