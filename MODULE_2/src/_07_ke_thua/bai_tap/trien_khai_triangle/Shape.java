package _07_ke_thua.bai_tap.trien_khai_triangle;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
        color = "blue";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
