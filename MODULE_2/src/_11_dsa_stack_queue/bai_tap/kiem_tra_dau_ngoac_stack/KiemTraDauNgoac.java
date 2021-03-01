package _11_dsa_stack_queue.bai_tap.kiem_tra_dau_ngoac_stack;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("enter input: ");
        String wantCheck = input.nextLine();
        String left = "";
        for (int i = 0; i < wantCheck.length(); i++) {
            if (wantCheck.charAt(i) == '(') {
                stack.push(wantCheck.charAt(i));
            } else {
                if (!stack.empty()) {
                    if (wantCheck.charAt(i) == ')') {
                        left += stack.pop();
                    }
                }
            }
        }
        if(stack.empty()){
            System.out.println("right");
        }else
            System.out.println("wrong");

    }
}
