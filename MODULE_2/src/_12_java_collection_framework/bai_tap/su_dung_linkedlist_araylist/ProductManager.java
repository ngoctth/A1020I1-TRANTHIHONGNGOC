package _12_java_collection_framework.bai_tap.su_dung_linkedlist_araylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {

        Menu menu = new Menu();
        ArrayList<Product> list = new ArrayList<>();
        public void mainMenu(Scanner input) {
            while (true) {
                System.out.println("Nhập chương trình muốn thực hiện: ");
                int choose = input.nextInt();
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
                    case 6:menu.sortPrice(list);
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
