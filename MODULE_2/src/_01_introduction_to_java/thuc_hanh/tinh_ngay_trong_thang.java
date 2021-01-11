package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class tinh_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tháng bạn muốn kiểm tra:  " );
        int month = sc.nextInt();
        switch (month){
            case 1 :
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Tháng " +month+ " có 31 ngày"); break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng %d có 30 ngày",month); break;
            case 2:
                System.out.println("Tháng " + month  +" có 28 hoặc 29 ngày"); break;
            default:
                System.out.print("Vui lòng nhập đúng tháng");

        }
    }
}
