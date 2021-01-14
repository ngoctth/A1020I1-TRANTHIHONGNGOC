package _03_array.bai_tap.them_phan_tu_vao_mang;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,6,8,4,9,1};

            System.out.print("Enter an element you want to insert: ");
            int x = input.nextInt();
            System.out.print("Enter position you want to insert: ");
            int index;
            int[] arr2 = Arrays.copyOf(arr,arr.length + 1);
            do {
                System.out.print("can't insert element into array ");
                index = input.nextInt();
            }while (index<0||index>arr2.length-1);
            for (int i=arr2.length-1;i>index;i--){
                    arr2[i]=arr2[i-1];
                }
            arr2[index]= x;
            System.out.print(Arrays.toString(arr2));




    }
}
