package _03_array.bai_tap.them_phan_tu_vao_mang;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,6,8,4,9,1};

            System.out.print(" Enter an element you want to insert: ");
            int x = input.nextInt();
            System.out.print("enter position you want to insert: ");
            int index = input.nextInt();
            for (int i=0;i<arr.length;i++){
                if(index<=1||index>arr.length-1){
                    System.out.print("can't insert element into array: ");
                }else{
                    arr[index]= x;

                }
            }
        System.out.print(Arrays.toString(arr));




    }
}
