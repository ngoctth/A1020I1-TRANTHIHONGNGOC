package _02_vong_lap_trong_java.thuc_hanh.tinh_tien_lai;

import java.util.Scanner;

public class tien_lai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money,month;
        double discount;
        System.out.print("The amount you want to deposit ");
        money = sc.nextInt();
        System.out.print("Discount (%) ");
        discount = sc.nextDouble();
        System.out.print("How long do you deposit?(month) ");
        month = sc.nextInt();
        double deposit = 0;
        for(int i =0;i<month;i++) {
             deposit += money*(discount/100)/12*month;
        }
        System.out.print("Total principal and interest are : " + deposit + "USD");
    }
}
