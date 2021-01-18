package _05_class_object.thuc_hanh.lop_hinh_chu_nhat;

public class HinhChuNhat {
    public int width;
    public int height;

    public HinhChuNhat(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public HinhChuNhat() {

    }

    public int chuVi(){
        return this.width*this.height;
    }
    public int dienTich(){
        return (this.height+this.height)*2;
    }
    public String hienThi(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
