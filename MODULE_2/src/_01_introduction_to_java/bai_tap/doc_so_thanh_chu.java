package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int number = sc.nextInt();

        String[] ones = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve",
                "Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] tens = {"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        if(number>0&&number<20){
            System.out.println(ones[number-1]);
        }
        if(number>=20&&number<100){
            int a = number;
            double b = (double) a/10;
            int c = (int)b;
            double d = ((b-c)*10);
            int e = (int)Math.round(d);
            if(d==0){
                System.out.println(tens[c-2]);
            }else {
                System.out.println(tens[c - 2] + ones[e - 1]);
            }
        }
        if(number>=100&&number<1000){
            int e = number;
            double f = (double)e/100;
            int g = (int)f;
            double h = (f-g)*100;
            int i = (int)Math.round(h);
            double k = (double) i/10;
            int l = (int)k;
            double m = (k-l)*10;
            int n = (int)Math.round(m);
            if(l==0&&n==0){
                System.out.println(ones[g-1] +" Hundred");
            }else{
                System.out.println(ones[g-1] +" Hundred " + tens[l-2] +" "+ ones[n-1]);
            }
        }
    }
}

