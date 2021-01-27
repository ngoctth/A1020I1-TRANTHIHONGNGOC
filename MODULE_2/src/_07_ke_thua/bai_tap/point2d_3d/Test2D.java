package _07_ke_thua.bai_tap.point2d_3d;

import java.util.Arrays;

public class Test2D {
    public static void main(String[] args) {
        Point2d point2d = new Point2d(3.5f,4.4f);
        float[] floats = point2d.getXY();
        System.out.println(Arrays.toString(floats));
    }
}
