package _03_array.thuc_hanh.chuyen_doi_nhiet_do;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choose;
        do {
            int fahrenheit;
            int celsius;
            System.out.println("1. Fahrenheit to Celsius \n" +
                                "2. Celsius to Fahrenheit \n" +
                                "3. Exit");
            System.out.print("Choose program : ");
            choose = in.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Type Fahrenheit: ");
                    fahrenheit = in.nextInt();
                    System.out.println(fahrenheit + " oF = " + (fahrenheit-32)/1.8 + " oC" );
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Type Celsius: ");
                    celsius = in.nextInt();
                    System.out.println(celsius + " oC = " + (1.8*celsius+32) + " oF" );
                    System.out.println(" ");
                    break;
            }
        }while(choose !=3);
    }
}
