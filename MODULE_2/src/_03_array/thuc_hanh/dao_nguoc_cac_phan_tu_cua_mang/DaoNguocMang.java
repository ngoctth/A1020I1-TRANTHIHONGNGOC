package _03_array.thuc_hanh.dao_nguoc_cac_phan_tu_cua_mang;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter size of array: ");
            size = input.nextInt();
            if(size>20){
                System.out.println("Size does not exceed 20");
            }
        }while(size>20);
        array =  new int[size];
        for(int i = 0;i<array.length;i++){
            System.out.printf("Enter element %d: ",i);
            array[i] = input.nextInt();
        }
        System.out.print("All element in array are: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + ",");
        }
        System.out.println(" ");
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.print("All element in array reverse after are : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + ",");
        }
    }
}
