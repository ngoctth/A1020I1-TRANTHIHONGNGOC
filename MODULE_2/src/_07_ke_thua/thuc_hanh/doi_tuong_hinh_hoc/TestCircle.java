package _07_ke_thua.thuc_hanh.doi_tuong_hinh_hoc;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.toString());
        circle.setColor("red");
        circle.setFilled(false);
        System.out.println(circle.toString());
        Circle circle1 = new Circle("yellow",true,3);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.toString());
    }
}
