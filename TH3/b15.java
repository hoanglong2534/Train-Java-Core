package CodeThieuNhi.TH3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.util.Collections.EMPTY_LIST;
import static java.util.Collections.swap;

public class b15 {

    public static boolean nt(int n) {
        if(n < 2) return false;
        for(int i = 2 ; i <= sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dong va so cot: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.println("nhap gia tri ma tran");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        //a: tim gtln va chi so
        int max = a[1][1];
        int hang = 1, cot = 1;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                    hang = i;
                    cot = j;
                }
            }
        }
        System.out.println("GTLN: " + max + " - tai hang: " + (hang + 1) + " cot: " + (cot + 1) );

        //b: Tìm và in ra các phần tử là số nguyên tố của ma trận (các phần tử không nguyên tố thì
        //thay bằng số 0).

        int[][] b = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                b[i][j] = a[i][j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!nt(b[i][j])){
                    b[i][j] = 0;
                }
            }
        }
        System.out.println("Cac so nguyen to co trong ma tran: ");
        for(int i = 0; i < n; i++){
            for(int j= 0; j < m; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }

        //c Sắp xếp tất cả các cột của ma trận theo thứ tự tăng dần và in kết quả ra màn hình
        for(int j = 0 ; j < m ; j++){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add(a[i][j]);
            }
            Collections.sort(list);
            for(int i = 0; i < n; i++){
                a[i][j] = list.get(i);
            }
        }

        System.out.println("ma tran sau khi sap xep:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        //d: Tìm cột trong ma trận có nhiều số nguyên tố nhất.
        int res = 0;
        int c = 0;
        for(int j = 0 ; j < m ; j++){
            int cnt = 0;

            for(int i = 0; i < n; i++){
                if(nt(a[i][j])){
                    cnt++;
                }
            }
            if(cnt > res) {
                res = cnt;
                c = j + 1;
            }

        }
        System.out.println("Cot " + c + " co nhieu so nguyen to nhat - co " + res + " so");
    }
}
