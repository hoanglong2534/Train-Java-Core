package CodeThieuNhi.TH3;

import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {

        int[] cnt=new int[1000005];

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        System.out.println("nhap gia tri: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        System.out.println("Phan tu chi xuat hien 1 lan: " );
        for(int i=0;i<n;i++){
            if(cnt[a[i]]==1){
                System.out.print(a[i] + " ");
            }
        }

    }
}
