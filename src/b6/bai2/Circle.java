package b6.bai2;

import static java.lang.Math.PI;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "ban kinh: " + getRadius() + "\ncolor: " + getColor() + "\nfilled: " + isFilled()
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
