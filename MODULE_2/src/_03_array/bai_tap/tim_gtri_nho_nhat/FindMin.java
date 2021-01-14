package _03_array.bai_tap.tim_gtri_nho_nhat;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("enter size of array: ");
        size = input.nextInt();
        int[] array = new int[size];
        for(int i =0;i<array.length;i++){
            System.out.print("enter element "+ i +" for array: ");
            array[i] = input.nextInt();
        }
        int min = array[0];
        for(int i = 0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.print("Min of array is: "+ min);
    }
}
