package _11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_li_queue;

import java.util.LinkedList;
import java.util.Queue;


public class DuLieuHopLy {
    public static void main(String[] args) {
        Queue<NhanVien> nu = new LinkedList<>();
        Queue<NhanVien> nam = new LinkedList<>();
        NhanVien[] nhanVien = new NhanVien[6];
        nhanVien[0] = new NhanVien("Ngoc","Nu","12/02/1999");
        nhanVien[1] = new NhanVien("Nga","Nu","12/01/1999");
        nhanVien[2] = new NhanVien("Nghi","Nam","14/05/1999");
        nhanVien[3] = new NhanVien("Nguyet","Nu","11/06/1999");
        nhanVien[4] = new NhanVien("Ngai","Nam","1/08/1999");
        nhanVien[5] = new NhanVien("Ngoc","Nam","2/09/1999");
        String output ="";
        for (int i=0;i<nhanVien.length;i++) {
            if (nhanVien[i].sex == "Nu") {
                nu.offer(nhanVien[i]);
            } else {
                nam.offer(nhanVien[i]);
            }
            if (!nu.isEmpty()) {
                output += nu.poll();
            }
            if (!nam.isEmpty()) {
                output += nam.poll();
            }
        }
        System.out.println(output);
    }
}
