package _12_java_collection_framework.thuc_hanh.comparable_comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<HocSinh> {

    @Override
    public int compare(HocSinh o1, HocSinh o2) {
        if(o1.getOld()>o2.getOld()){
            return 1;
        }else if(o1.getOld()==o2.getOld()){
            return 0;
        }else {
            return -1;
        }
    }
}
