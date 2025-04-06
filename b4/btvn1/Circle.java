package b4.btvn1;

public class Circle extends Point{

    private int r;

    public double chuVi(int r) {
        double cv = 2 * 3.14 * r;
        return cv;
    }

    public double dienTich(double r) {
        double dt = 3.14 * r * r;
        return dt;
    }

}
