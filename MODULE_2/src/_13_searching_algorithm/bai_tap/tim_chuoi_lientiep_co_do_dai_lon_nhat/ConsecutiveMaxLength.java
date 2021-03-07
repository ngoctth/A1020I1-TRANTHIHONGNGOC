package _13_searching_algorithm.bai_tap.tim_chuoi_lientiep_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class ConsecutiveMaxLength {
    public static void main(String[] args) {
        System.out.println("input string you want: ");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        max.add(inputString.charAt(0));
        String str1 ="";
        String str2 ="";
        for(int i=0;i<inputString.length();i++){
            if(max.getLast()<inputString.charAt(i)) {
                str1 += max.add(inputString.charAt(i));
            }
            if(max.contains(inputString.charAt(i))){
                max.clear();
                str2 +=max.add(inputString.charAt(i));
            }
            if(str1.length()>str2.length()){
                max.clear();
                max.add(str1.charAt(i));
            }else {
                max.clear();
                max.add(str2.charAt(i));
            }
            }
        System.out.println(max);
        }
//em chưa xog bài này, cho em thời gian suy nghĩ thêm

//        LinkedList<Character> list = new LinkedList<>();
//        LinkedList<Character> list1 = new LinkedList<>();
//        String maxStr = "";
//        String str = "";
//        for(int i =0; i<inputString.length();i++){
//           if(!list.contains(inputString.charAt(i))){
//               maxStr += list.add(inputString.charAt(i));
//
//           }else{
//               str+= list.add(inputString.charAt(i));
//           }
//            list.clear();
//            if(maxStr.length()>str.length()){
//               list1.add(maxStr.charAt(i));
//
//           }else{
//               list1.add(str.charAt(i));
//               maxStr = str;
//               str = "";
//           }
//        }
//        System.out.println(list1);

    }


