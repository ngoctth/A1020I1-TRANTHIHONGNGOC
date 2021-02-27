package _11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        Queue<Character> queue =new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string: ");
        String input = scanner.nextLine();
        
        String reserve = "";
//        for(int i = input.length()-1;i>=0;i--){
//            reserve = reserve + input.charAt(i);
//        }
//        if(input.equals(reserve)){
//            System.out.println("this string is a palindrome");
//        }else{
//            System.out.println("this string isn't a palindrome");
//        }
        for(int i = 0; i<input.length();i++){
            queue.offer(input.charAt(i));
        }
        
        while (!queue.isEmpty()){
            reserve +=queue.poll();
        }
        System.out.println(reserve);
        if(input.equals(reserve)){
            System.out.println("this string is a palindrome");
        }else{
            System.out.println("this string isn't a palindrome");
        }
    }

}
