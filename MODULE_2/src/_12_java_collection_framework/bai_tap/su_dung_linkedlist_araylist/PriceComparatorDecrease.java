package _12_java_collection_framework.bai_tap.su_dung_linkedlist_araylist;

import java.util.Comparator;

public class PriceComparatorDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice()>o2.getPrice()){
            return -1;
        }else if(o1.getPrice()==o2.getPrice()){
            return 0;
        }else {
            return 1;
        }
    }
}
