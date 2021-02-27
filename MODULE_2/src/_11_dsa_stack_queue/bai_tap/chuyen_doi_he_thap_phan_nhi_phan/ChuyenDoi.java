package _11_dsa_stack_queue.bai_tap.chuyen_doi_he_thap_phan_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoi {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so muon doi: ");
        int heThapPhan = scanner.nextInt();
        while (heThapPhan !=0){
            int heNhiPhan = heThapPhan %2;
            stack.push(heNhiPhan);
            heThapPhan /=2;
        }
        String ketqua = "";
        while (!stack.empty()){
            ketqua += stack.pop();
        }

        System.out.println(ketqua);

    }
}
