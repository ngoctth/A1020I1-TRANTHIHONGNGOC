package _11_dsa_stack_queue.bai_tap.dao_nguoc_stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] a = new int[]{1,2,3,4,5};
        for(int i: a){
            stack.push(i);
        }
        stack.peek();
        System.out.println(stack);
        for(int i = 0; !stack.empty();i++){ //!stack.empty() = a.length
           a[i]= stack.pop();
        }
        System.out.println(Arrays.toString(a));
    }
}
