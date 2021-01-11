package _02_vong_lap_trong_java.thuc_hanh.kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number your want to check ");
        int snt = scanner.nextInt();
        boolean check = true;
        if(snt<2){
            System.out.print("this number isn't prime number");
        }else {
            for (int i = 2; i <= snt-1; i++) {
                if (snt % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print("This number is prime number");
            } else {
                System.out.print("this number isn't prime number");
            }
        }
    }
}
