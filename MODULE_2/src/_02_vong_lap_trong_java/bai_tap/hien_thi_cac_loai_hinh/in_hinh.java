package _02_vong_lap_trong_java.bai_tap.hien_thi_cac_loai_hinh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class in_hinh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("0.Exit");
        System.out.print("Enter your choice: ");

        int choose = in.nextInt();
        switch (choose){
            case 1:
                for(int i=1;i<=3;i++){
                    for(int j = 1;j<6;j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }break;
            case 2:
                for(int i =0; i<6;i++){
                    for(int j=0; j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                System.out.println("");
                 for(int i =6; i>=1;i--){
                     for(int j=0;j<i;j++){
                         System.out.print(" ");
                     }for(int j =6;j>=i;j--){
                         System.out.print("*");
                     }
                     System.out.println("");
                 }
                System.out.println(" ");
                for(int i =0; i<6;i++){
                    for(int j=0; j<i;j++){
                        System.out.print(" ");
                    }for (int j=i; j < 6; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println(" ");
                for(int i = 5; i>=0;i--){
                    for(int j=0;j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                for(int n =6; n>1;n--){
                    for (int k = 6;k>n;k-- ){
                        System.out.print(" 0 ");
                    }
                        System.out.println("");

                }

        }
    }
}
