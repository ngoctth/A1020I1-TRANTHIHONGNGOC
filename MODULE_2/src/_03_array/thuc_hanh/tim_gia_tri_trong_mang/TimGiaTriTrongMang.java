package _03_array.thuc_hanh.tim_gia_tri_trong_mang;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameStudent;
        String[] student = {"Trung","Nga", "Huyen" , "Thuy" , "Lan"};

        System.out.print("Type name of student: ");
        nameStudent= input.nextLine();
        boolean check = false;
        for(int i =0;i<student.length;i++){
            if(student[i].equals(nameStudent)){
                System.out.println("Position of the students in the list " + nameStudent + " is: " + (i + 1));
                check =true;
                break;
                }
        }if(!check) {
                System.out.println(nameStudent + " not alive in array");
        }


    }
}
