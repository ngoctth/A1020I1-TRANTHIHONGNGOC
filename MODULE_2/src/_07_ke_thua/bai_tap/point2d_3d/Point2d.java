package _07_ke_thua.bai_tap.point2d_3d;

public class Point2d {
    protected float x;
    protected float y;

    public Point2d() {
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY( ) {
        return new float[]{x,y};
    }

    public void setXY(float y, float x) {
        this.x  = x;
        this.y  = y;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
