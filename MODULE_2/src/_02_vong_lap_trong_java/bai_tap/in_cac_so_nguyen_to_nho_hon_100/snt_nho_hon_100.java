package _02_vong_lap_trong_java.bai_tap.in_cac_so_nguyen_to_nho_hon_100;

public class snt_nho_hon_100 {
    public static void main(String[] args) {
       int n = 2;
       boolean check;
        while (n<100){
            check = true;
            for (int i = 2; i < n; i++){
                if(n%i==0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.print(n +" ");
            }
            n++;
        }


    }
}
