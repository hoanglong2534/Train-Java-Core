package CodeThieuNhi.TH2;

public class b25 {
    public static void main(String[] args) {

        // hình 1
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= i; j++) {
                if(i == 9 || j == 1 || i == j) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
