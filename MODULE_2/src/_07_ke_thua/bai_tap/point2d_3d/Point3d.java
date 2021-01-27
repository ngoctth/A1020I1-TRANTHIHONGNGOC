package _07_ke_thua.bai_tap.point2d_3d;

public class Point3d extends Point2d{
    private float z;

    public Point3d(){
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{x,y,z};
    }

    public void setXYZ(float x, float y, float z) {
        this.x  = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
