package _02_vong_lap_trong_java.thuc_hanh.thiet_ke_menu;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = in.nextInt();
        switch (choice){
            case 1:
                for(int i=0;i<6;i++){
                    for(int j =0;j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }break;
            case 2:
                for(int i =1;i<5;i++){
                    for(int j =1;j<6;j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }break;
            case 3:
                for(int i = 1;i<=3;i++){
                    for(int j =1;j<6;j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice");
        }
    }
}
