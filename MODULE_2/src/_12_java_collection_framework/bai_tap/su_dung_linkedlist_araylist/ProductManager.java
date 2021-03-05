package _12_java_collection_framework.bai_tap.su_dung_linkedlist_araylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {

     Menu menu = new Menu();
     ArrayList<Product> list = new ArrayList<>();
    public void mainMenu(Scanner input) {
        while (true) {
            System.out.println(
                    "1.\tAdd New Product\n" +
                    "2.\tEdit Product\n" +
                    "3.\tDelete Product\n" +
                    "4.\tDisplay Product\n" +
                    "5.\tFind Name Product\n" +
                    "6.\tSort Price of Product\n" +
                    "7.\tExit\n" +
                    "\tNhập chương trình muốn thực hiện: " );
            int choose = input.nextInt();
            input.nextLine();
            switch (choose) {
                case 1:
                    menu.addNewProduct(input, list);
                    break;
                case 2:
                    menu.editProduct(input,list);
                    break;
                case 3:
                    menu.deleteProduct(input,list);
                    break;
                case 4:
                    menu.displayProduct(list);
                    break;
                case 5:
                    menu.findNameProduct(input,list);
                    break;
                case 6:
                    menu.sortPrice(input,list);
                    break;
                case 7:
                    System.out.println("Goodbye!!");
                    break;

            }
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
       productManager.mainMenu(input);

    }




}
