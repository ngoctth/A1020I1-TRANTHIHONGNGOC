package _03_array.thuc_hanh.tim_gia_tri_trong_mang;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameStudent;
        String[] student = {"Trung","Nga", "Huyen" , "Thuy" , "Lan"};

        System.out.print("Type name of student: ");
        nameStudent= input.nextLine();
        for(int i =0;i<student.length;i++){
            if(nameStudent == student[i]){
                System.out.print(student[i]);
        }else {
                System.out.println("This name not alive in array");
            }
        }

    }
}
