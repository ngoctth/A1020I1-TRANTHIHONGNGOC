package _03_array.bai_tap.so_lan_xuat_hien_ki_tu;

import java.util.Scanner;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "i love you when you call me senorita";
        String b;
        System.out.print("enter char you want to check: ");
        b = in.nextLine();
        char c = b.charAt(0);
        int count =0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==c){
                count++;
            }
        }
        System.out.println("Number of occurrences of " +b +": " +count);
    }
}
