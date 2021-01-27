package _08_abstractClass_interface.bai_tap.interface_colorable;

public class TestMain {
    public static void main(String[] args) {
        Shape1[] shape = new Shape1[3];
        shape[0] = new Square1(3);
        shape[1] = new Circle1(0.5);
        shape[2] = new Rectangle1(0.4,0.6);
        for(Shape1 i: shape){
            if(i instanceof Square1){
                Square1 sq = (Square1) i;
                sq.howColor();
                System.out.println(sq.getArea());
            }else if(i instanceof Rectangle1){
                Rectangle1 re = (Rectangle1) i;
                System.out.println(re.getArea());
            }else{
                Circle1 cir = (Circle1) i;
                System.out.println(cir.getArea());
            }
        }
    }
}
