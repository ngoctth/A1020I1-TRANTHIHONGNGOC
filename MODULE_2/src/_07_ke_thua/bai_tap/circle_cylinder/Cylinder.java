package _07_ke_thua.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private  double height;

    public  Cylinder(){
        this.height = 10;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double volume(){
        return  area()*height;
    }

    @Override
    public double area() {
        return 2*Math.PI*radius*(radius+height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
