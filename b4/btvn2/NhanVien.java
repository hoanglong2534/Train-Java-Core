package b4.btvn2;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String ten, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }
}
