package b4.btvn2;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        QLCB ql = new QLCB();
        CanBo cb1 = new CanBo("Long", 20, "Nam", "Ha Dong");
        CanBo cb2 = new CanBo("Hoang", 18, "Nam", "Thanh Xuan");

        ql.add(cb1);
        ql.add(cb2);
        System.out.println("Danh sach can bo : ");
        ql.display();

        List<CanBo> res;
        res = ql.getCanBos("Long");
        for (CanBo cb : res) {
            System.out.println(cb);
        }
    }
}
