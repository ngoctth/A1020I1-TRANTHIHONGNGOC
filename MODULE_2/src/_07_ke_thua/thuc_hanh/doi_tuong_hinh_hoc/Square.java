package _07_ke_thua.thuc_hanh.doi_tuong_hinh_hoc;

public class Square extends Rectangle {
    protected double side;
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double width){
        super.setWidth(width);
    }

    public void setLength(double length){
        super.setLength(length);
    }

    public String toString(){
       return  "Square with side = "+ getSide() + ", which is a subclass of " + super.toString();
    }
}
