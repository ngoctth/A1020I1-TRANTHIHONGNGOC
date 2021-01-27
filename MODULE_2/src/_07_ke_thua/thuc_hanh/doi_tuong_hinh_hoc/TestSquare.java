package _07_ke_thua.thuc_hanh.doi_tuong_hinh_hoc;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        System.out.println("area of square is: "+ square.getArea());
        Square square1 = new Square(4);
        System.out.println(square1);
        System.out.println("area of square is: "+ square1.getArea());
        Square square2 = new Square();
        square2.setSide(3);
        square2.setColor("Black");
        square2.setFilled(false);
        System.out.println(square2);
    }
}

