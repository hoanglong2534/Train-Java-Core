package CodeThieuNhi.TH3;

import java.util.*;

public class b11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        System.out.println("nhap gia tri: ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
        }
        Collections.sort(list);
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
