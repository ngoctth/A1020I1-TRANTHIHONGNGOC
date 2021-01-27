package _08_abstractClass_interface.thuc_hanh.interface_comparator;

import java.util.Comparator;

public class CircleComparator extends Circle implements Comparator<Circle> {
    public CircleComparator() {
    }

    public CircleComparator(double radius) {
        super(radius);
    }

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        CircleComparator circle1 = new CircleComparator();
        CircleComparator ci2 = new CircleComparator(0.5);
        Comparator com = new CircleComparator();
        System.out.println(com.compare(circle1,ci2));

    }

}
