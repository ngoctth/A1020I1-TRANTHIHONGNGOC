package _03_array.bai_tap.tinh_tong_1_cot;

import java.util.Scanner;

public class TotalOfColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        int position;
        System.out.print("enter rows: ");
        row =input.nextInt();
        System.out.print("enter columns: ");
        col = input.nextInt();
        int[][] arr;
        arr = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("enter element of position " +"["+i+"]"+"["+j+"]: ");
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println();
        System.out.print("All element in array are : "  );
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + ",");
            }
        }
        System.out.println();
        System.out.print("the column you want to sum up: ");
        position = input.nextInt();
        int total = 0;
        for (int i = 0; i <col; i++) {

            total += arr[i][position];
        }
        System.out.println("Sum for column " + position + " is "
                + total);
    }
}
