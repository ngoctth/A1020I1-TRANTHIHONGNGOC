package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class phuong_trinh_bac_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();
        if (a!=0){
            System.out.println("có 1 nghiệm x = " + (c-b)/a);
        }else{
            if(b==0){
                System.out.println("phương trình có vô số nghiệm");
            }else{
                System.out.println("phương trình vô nghiệm");
            }
        }

    }
}
