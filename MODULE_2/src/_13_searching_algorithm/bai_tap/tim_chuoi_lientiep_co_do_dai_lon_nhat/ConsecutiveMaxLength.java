package _13_searching_algorithm.bai_tap.tim_chuoi_lientiep_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class ConsecutiveMaxLength {
    public static void main(String[] args) {
        System.out.println("input string you want: ");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();
        for(int i=0;i<inputString.length();i++){
            if(list.size()>1&&list.getLast()>=inputString.charAt(i)&&list.contains(inputString.charAt(i))) {
                list.clear();
            }
                list.add(inputString.charAt(i));

            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            }
        System.out.println(max);
        }
    }


