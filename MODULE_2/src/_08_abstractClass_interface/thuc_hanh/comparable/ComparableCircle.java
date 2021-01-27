package _08_abstractClass_interface.thuc_hanh.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableCircle extends Circle implements Comparable<Circle> {
    public ComparableCircle(){
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(Circle o) {
        if (this.getRadius() > o.getRadius()) return 1;
        else if (this.getRadius() < o.getRadius()) return -1;
        else return 1;
    }

    public static void main(String[] args) {
        ComparableCircle[] circle = new ComparableCircle[3];
        circle[0] = new ComparableCircle(3.4);
        circle[1]= new ComparableCircle();
        circle[2] = new ComparableCircle(2.4);
        System.out.println("Pre-sorted:");
        for(ComparableCircle i: circle){
            System.out.println(i);
        }
        Arrays.sort(circle);
        System.out.println("After-sorted:");
        for(ComparableCircle i: circle){
            System.out.println(i);
        }
    }
}
