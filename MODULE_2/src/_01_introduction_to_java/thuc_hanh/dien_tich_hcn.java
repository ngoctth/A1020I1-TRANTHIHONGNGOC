package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class dien_tich_hcn {
    public static void main(String[] args) {
        System.out.println("Nhap chieu rong");
        Scanner scanner = new Scanner(System.in);
        int chieuRong = scanner.nextInt();
        System.out.println("Nhap chieu cao");
        int chieuCao = scanner.nextInt();
        System.out.println("Diện tích hình chữ nhật bằng " + chieuRong*chieuCao);
    }
}
