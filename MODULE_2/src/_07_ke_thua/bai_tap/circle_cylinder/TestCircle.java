package _07_ke_thua.bai_tap.circle_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"black");
        System.out.println(circle);
        System.out.println(circle.area());
        Circle circle1 = new Circle();
        circle1.setColor("green");
        System.out.println(circle1);
        System.out.println("area of circle " + circle1.area());
    }
}
