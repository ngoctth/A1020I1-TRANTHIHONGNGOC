package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class chi_so_co_the {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chieuCao, canNang, chiSoBmi;
        System.out.print("Nhập chiều cao của bạn (m) ");
        chieuCao = scanner.nextDouble();
        System.out.print("Nhập cân nặng của bạn (kg) ");
        canNang =scanner.nextDouble();
        chiSoBmi = canNang/Math.pow(chieuCao,2);
        if(chiSoBmi<18.5){
            System.out.print("Quá gầy");
        }else if(chiSoBmi<25.0){
            System.out.print("Bình thường");
        }else if(chiSoBmi<30.0){
            System.out.print("Thừa cân");
        }else{
            System.out.print("Béo phì");
        }
    }
}
