package b4.btvn2;

public class CanBo {

    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo(String ten, int tuoi, String gioiTinh, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "ten='" + ten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
