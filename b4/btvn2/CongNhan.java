package b4.btvn2;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan(String ten, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }
}
