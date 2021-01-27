package _08_abstractClass_interface.bai_tap.interface_resizeable;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        System.out.print("before circle size: ");
        System.out.println(circle.getRadius());
        System.out.print("before perimeter: ");
        System.out.println(circle.getPerimeter());
        System.out.print("after circle size: ");
        circle.resize(100);
        System.out.println(circle.getRadius());
        System.out.print("after perimeter: ");
        System.out.println(circle.getPerimeter());
        Square square = new Square(2.0);
        System.out.print("After square size: ");
        System.out.println(square.getSide());
        System.out.print("before perimeter: ");
        System.out.println(square.getPerimeter());
        square.resize(50);
        System.out.print("Before square size: ");
        System.out.println(square.getSide());
        System.out.print("after perimeter: ");
        System.out.println(square.getPerimeter());
    }
}
