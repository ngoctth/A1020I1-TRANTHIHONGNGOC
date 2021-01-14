package _03_array.bai_tap.tim_max_trog_mang_2_chieu;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        System.out.print("Enter rows: ");
        row = input.nextInt();
        System.out.print("Enter columns: ");
        col = input.nextInt();
        int[][] arr = new int[row][col];
        for(int i =0;i<row;i++){
            for(int j=0; j<col;j++){
                System.out.print("Enter element of position " +"["+ i+ "]"+"[" + j +"]:  " );
                arr[i][j]= input.nextInt();
            }
        }
        int max = arr[0][0];
        for(int i = 0;i<row;i++){
            for(int j =0; j<col;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Max of number in array is: " + max);
    }
}
