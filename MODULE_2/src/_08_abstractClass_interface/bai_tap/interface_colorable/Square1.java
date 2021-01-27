package _08_abstractClass_interface.bai_tap.interface_colorable;

public class Square1 extends Rectangle1 implements Colorable {
    public Square1() {
    }

    public Square1(double side) {
        super(side, side);
    }

    public Square1(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howColor() {
        System.out.println("Color all four sides.");

    }
}
