package _03_array.bai_tap.xoa_phan_tu_khoi_mang;


import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {3,6,8,9,4,2,1};
        System.out.print("enter an element you want to delete: ");
        int x = input.nextInt();
        boolean check = false;
        int index=0 ;
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                check = true;
                index=i;
                break;
            }
        }
        if(check){
            for(int i=index;i<array.length-1;i++){
                array[i]=array[i+1];
            }
            array[array.length-1]=0;
        }else {
            System.out.print("This element not alive");
            return;
        }
        System.out.println();
        System.out.print("Position of index is " +index);
        System.out.println();
        System.out.println(Arrays.toString(array));

    }
}
