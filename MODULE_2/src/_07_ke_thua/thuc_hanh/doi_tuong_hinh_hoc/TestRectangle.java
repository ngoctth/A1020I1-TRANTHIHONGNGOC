package _07_ke_thua.thuc_hanh.doi_tuong_hinh_hoc;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Pink",false,5.4,4.6);
        System.out.println(rectangle);
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(5);
        rectangle1.setWidth(3);
        System.out.println(rectangle1);
    }
}
