package _13_searching_algorithm.bai_tap.tim_chuoi_lientiep_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class ConsecutiveMaxLength {
    public static void main(String[] args) {
        System.out.println("input string you want: ");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> list1 = new LinkedList<>();
        String maxStr = "";
        String str = "";
        for(int i =0; i<inputString.length();i++){
           if(!list.contains(inputString.charAt(i))){
               maxStr += list.add(inputString.charAt(i));

           }else{
               str+= list.add(inputString.charAt(i));
           }
            list.clear();
            if(maxStr.length()>str.length()){
               list1.add(maxStr.charAt(i));

           }else{
               list1.add(str.charAt(i));
               maxStr = str;
               str = "";
           }
        }
        System.out.println(list1);

    }

}
