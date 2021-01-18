package _05_class_object.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if(delta > 0){
            System.out.println("Equation has two roots: " + quadraticEquation.getRoot1() +" & " + quadraticEquation.getRoot2());
        }
        else if(delta == 0){
            System.out.println("Equation has double roots: " + quadraticEquation.getRoot2());
        }else {
            System.out.println("Impossible equation.");
        }
    }
}
