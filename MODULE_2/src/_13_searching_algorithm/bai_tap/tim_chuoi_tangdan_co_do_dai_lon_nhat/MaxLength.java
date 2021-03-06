package _13_searching_algorithm.bai_tap.tim_chuoi_tangdan_co_do_dai_lon_nhat;

import java.util.Scanner;

public class MaxLength {
    public static void main(String[] args) {
        System.out.println("Input string you want: ");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

//        LinkedList<Character> max = new LinkedList<>();
//        max.add(inputString.charAt(0));
//        for(int i = 1;i<inputString.length();i++){
//            if((int)max.getLast()<inputString.charAt(i)){
//                max.add(inputString.charAt(i));
//            }
//        }
//        System.out.println(max);
        String str = Character.toString(inputString.charAt(0));

        for (int i = 1; i<inputString.length();i++){
            if((int)str.charAt(str.length()-1)<(int)inputString.charAt(i)){
                str += inputString.charAt(i);
            }
        }
        System.out.println(str);

    }
}
