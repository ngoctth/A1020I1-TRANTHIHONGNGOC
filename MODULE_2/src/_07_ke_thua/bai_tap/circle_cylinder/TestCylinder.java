package _07_ke_thua.bai_tap.circle_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2,"pink",40);
        System.out.println(cylinder);
        System.out.println("area of cylinder is " +cylinder.area());
        System.out.println(("volume of cylinder is " + cylinder.volume()));
        cylinder.setColor("brow");
        System.out.println(cylinder);
    }
}
