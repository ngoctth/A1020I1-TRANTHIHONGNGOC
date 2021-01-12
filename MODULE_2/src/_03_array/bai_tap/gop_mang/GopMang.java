package _03_array.bai_tap.gop_mang;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("input element " + (arr1[i] + 1) + " of array1: ");
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("input element " + (arr2[i] + 1) + " of array2: ");
            arr2[i] = input.nextInt();
        }
        int[] arr3 = new int[6];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr3[arr2.length]; j++) {
            arr3[j] = arr2[j];

        }
        System.out.println("all element of array 3: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + ",");

        }

    }
}
