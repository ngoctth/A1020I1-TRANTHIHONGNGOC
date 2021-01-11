package _02_vong_lap_trong_java.thuc_hanh.uoc_chung_lon_nhat;

import java.util.Scanner;

public class ucln {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number a ");
        int a = sc.nextInt();
        System.out.print("Enter number b ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0||b==0){
            System.out.print("No greatest common factor");
        }
        while (a!=b) {
            if (a > b) {
                a = a-b;
            }else{
                b =b -a;
            }
        }
        System.out.println("Greatest common factor:  " + a);
    }
}
