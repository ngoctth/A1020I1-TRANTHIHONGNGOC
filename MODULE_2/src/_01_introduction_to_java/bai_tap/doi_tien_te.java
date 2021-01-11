package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class doi_tien_te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter money you want to change (USD): ");
        double money = sc.nextDouble();
        if(money>0){
            System.out.print(money*23150 + " VNĐ");
        }
        else{
            System.out.println("your money you want to change lower then 0");
        }
    }
}
