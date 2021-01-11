package _02_vong_lap_trong_java.bai_tap.in_20_so_nguyen_to_dau_tien;

public class in_20_snt {
    public static void main(String[] args) {
        int count = 0, n=2;
        while (count<20) {
            boolean check = true;
            int i;
            for (i = 2; i < n; i++){
                if(n%i==0){
                    check = false;
                }
            }if(check){
                System.out.print(i +" ");
                count++;
            }
            n++;
        }
    }
}
