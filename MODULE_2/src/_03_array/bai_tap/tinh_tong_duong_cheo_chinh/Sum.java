package _03_array.bai_tap.tinh_tong_duong_cheo_chinh;


import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        size = input.nextInt();
        int[][] array = new int[size][size];

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print("enter element " +i+"." +j +": ");
                array[i][j] = input.nextInt();
            }
        }

        int total = 0;
        for(int i=0;i<array.length;i++){
            total +=array[i][i];
        }
        System.out.println("Sum values for the first diagonal is : " + total);
         total =0;
         for(int i =0;i<array.length;i++){
             total += array[i][(array.length-1)-i];
         }
        System.out.println("Sum values for the next diagonal is: " + total);

    }


}
