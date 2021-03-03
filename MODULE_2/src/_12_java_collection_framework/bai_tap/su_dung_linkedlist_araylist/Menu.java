package _12_java_collection_framework.bai_tap.su_dung_linkedlist_araylist;

import _12_java_collection_framework.thuc_hanh.comparable_comparator.HocSinh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Menu {

    public void addNewProduct(Scanner input, ArrayList<Product> list){
        System.out.println("Nhập id sản phẩm: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String nameProduct = input.nextLine();
        System.out.println("Nhập giá của sản phẩm: ");
        double price = input.nextDouble();
        Product product = new Product(id,nameProduct,price);
        list.add(product);
        System.out.println("Thêm vào thành công");
    }

    public void editProduct(Scanner input, ArrayList<Product> list){
        System.out.println("Nhập Id sản phẩm muốn sửa: ");
        int id = input.nextInt();
        input.nextLine();
        int check = checkId(id,list);
        if(check!=-1){
            System.out.println("Nhập id sản phẩm: ");
            list.get(check).setId(input.nextInt());
            input.nextLine();
            System.out.println("Nhập tên sản phẩm: ");
            list.get(check).setNameProduct(input.nextLine());
            System.out.println("Nhập giá của sản phẩm: ");
            list.get(check).setPrice(input.nextDouble());

        }else{
            System.out.println("Id không tồn tại. Vui lòng thử lại");
        }
        }

    public int checkId(int id, ArrayList<Product> list){
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (id == list.get(i).getId()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void deleteProduct(Scanner input, ArrayList<Product> list){
        System.out.println("Nhập Id sản phẩm bạn muốn xóa: ");
        int id = input.nextInt();
        int check = checkId(id,list);
        if(check !=-1){
            list.remove(check);
            System.out.println("Xóa  thành công.");
        }else {
            System.out.println("Id không tồn tại. Vui lòng thử lại");
        }
    }

    public void displayProduct( ArrayList<Product> list){
        if(!list.isEmpty()) {
            System.out.println(list);
        }else{
            System.out.println("Danh sách sản phẩm trống!!");
        }
    }
    public void findNameProduct(Scanner input,ArrayList<Product> list ){
        System.out.println("Nhập tên sản phẩm bạn muốn tìm: ");
        input.nextLine();
        String nameProduct = input.nextLine();
        String check = checkNameProduct(nameProduct,list);
        if(nameProduct.equals("Không tìm thấy")){
            System.out.println("Không tìm thấy");
        }else{
            System.out.println(check);
        }

    }

    public String checkNameProduct(String nameProduct, ArrayList<Product> list){
        String string = "";
        if (!list.isEmpty()) {
            for (Product i : list) {
                if (i.getNameProduct().equals(nameProduct)) {
                    string += i.toString();
                    string += "\n";
                }
                if (string.length() == 0) {
                    return " Không tìm thấy";
                } else {
                    return string;
                }
            }
        }
        return "Không tìm thấy";
    }

    public void sortPrice(Scanner input, ArrayList<Product> list){
        System.out.println("Bạn muốn sắp xếp theo: 1. Giá tăng dần  2.Giá giảm dần:  ");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                if(!list.isEmpty()) {
                    PriceComparator priceComparator = new PriceComparator();
                    Collections.sort(list, priceComparator);
                    System.out.println("So sánh giá tăng dần");
                    for (Product i : list) {
                        System.out.println(i.toString());
                    }
                }else {
                    System.out.println("Danh sách trống!!");
                }
                break;
            case 2:
                if(!list.isEmpty()) {
                    PriceComparatorDecrease priceComparatorDecrease = new PriceComparatorDecrease();
                    Collections.sort(list, priceComparatorDecrease);
                    System.out.println("So sánh giá tăng dần");
                    for (Product i : list) {
                        System.out.println(i.toString());
                    }
                }else {
                    System.out.println("Danh sách trống!!");
                }
                break;
        }

    }

}
