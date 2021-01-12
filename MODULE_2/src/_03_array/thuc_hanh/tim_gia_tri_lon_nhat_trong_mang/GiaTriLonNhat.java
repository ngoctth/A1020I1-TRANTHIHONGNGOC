package _03_array.thuc_hanh.tim_gia_tri_lon_nhat_trong_mang;

import java.util.Scanner;

public class GiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size =  input.nextInt();
        array = new int[size];
        int max = array[0];
        for(int i = 0;i<array.length;i++){
            System.out.print("Type number "+i + " for array : ");
            array[i] = input.nextInt();
        }
        System.out.print("All element in array are: ");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i] + ",");
        }
        System.out.println("");

        for(int j =0;j<array.length;j++){
            if(array[j]>max){
                max = array[j];
            }
        }
        System.out.println("The largest property value in the list is ");
        System.out.print(max);
    }
}
