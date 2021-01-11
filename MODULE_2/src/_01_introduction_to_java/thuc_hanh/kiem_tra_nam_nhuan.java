package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm bạn muốn kiểm tra ");
        int year = sc.nextInt();
        boolean check = false;
        if(year % 400 ==0 || year %4==0 && year % 10 !=0 ){
            check = true;
        }if(check){
            System.out.printf("%d là năm nhuận", year);
        }else{
            System.out.printf("%d không phải là năm nhuận" ,year);
        }
    }
}
