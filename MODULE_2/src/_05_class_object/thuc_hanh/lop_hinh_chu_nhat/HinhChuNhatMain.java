package _05_class_object.thuc_hanh.lop_hinh_chu_nhat;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class HinhChuNhatMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();
        HinhChuNhat hinhChuNhat  = new HinhChuNhat(width,height);
        System.out.println("Your Rectangle \n"+ hinhChuNhat.hienThi());
        System.out.println("Perimeter of the Rectangle: "+ hinhChuNhat.dienTich());
        System.out.println("Area of the Rectangle: "+ hinhChuNhat.chuVi());
    }
}

