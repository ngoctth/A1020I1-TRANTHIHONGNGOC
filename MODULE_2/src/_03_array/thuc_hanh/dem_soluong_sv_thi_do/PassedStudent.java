package _03_array.thuc_hanh.dem_soluong_sv_thi_do;


import java.util.Scanner;

public class PassedStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int student;
        do {
            System.out.print("Enter the number of student: ");
            student = input.nextInt();
        }while (student>30);

        int[] arr = new int[student];
        int count = 0;
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter score of student " + (i+1) + ": ");
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=5&&arr[i]<=10){
                count++;
            }
        }
        System.out.print("The total number of passed students: "+count);
    }
}
