package _03_array.bai_tap.xoa_phan_tu_khoi_mang;


import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {3,6,8,9,4,2,1};
        System.out.print("enter an element you want to delete");
        int x = input.nextInt();
        for(int i=0;i<array.length;i++){
            if(array.equals(x)){
                System.out.print("the position of this element is: " + array[i]);

            }
        }
    }
}
