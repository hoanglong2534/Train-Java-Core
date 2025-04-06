package b6.bai2;

public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
       super.setLength(side);
       super.setWidth(side);
    }

    public Square(double side, String color, boolean filled) {
        super.setLength(side);
        super.setWidth(side);
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side) ;
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "side: " + getSide() + ", color: " + getColor() + ", filled: " + isFilled();
    }
}
