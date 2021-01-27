package _07_ke_thua.bai_tap.point2d_3d;

import java.util.Arrays;

public class Test3D {
    public static void main(String[] args) {
        Point3d point3d = new Point3d(3.4f,4.6f,3.5f);
        System.out.println(point3d);
        float[] xyz = point3d.getXYZ();
        System.out.println(Arrays.toString(xyz));


    }
}
