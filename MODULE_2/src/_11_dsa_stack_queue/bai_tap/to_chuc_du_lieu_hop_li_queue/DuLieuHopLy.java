package _11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_li_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DuLieuHopLy {
    public static void main(String[] args) {
        Queue<String> nu = new LinkedList<>();
        Queue<String> nam = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("nhap gioi tinh: ");
        String gioiTinh = in.nextLine();
        String output ="";
        if(gioiTinh == "nu"){
            nu.offer(gioiTinh);
        }else {
            nam.offer(gioiTinh);
        }
        if(!nu.isEmpty()){
            output +=nu.poll();
        }
        if(!nam.isEmpty()){
            output += nam.poll();
        }
        System.out.println(output);
    }
}
