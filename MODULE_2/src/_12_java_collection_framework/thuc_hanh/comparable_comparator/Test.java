package _12_java_collection_framework.thuc_hanh.comparable_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        HocSinh hocSinh1 = new HocSinh("huy",18,"hanoi");
        HocSinh hocSinh2 = new HocSinh("huyen",19,"hanoi");
        HocSinh hocSinh3 = new HocSinh("linh",20,"hcm");
        HocSinh hocSinh4 = new HocSinh("hang",18,"hcm");
        HocSinh hocSinh5 = new HocSinh("hoang",18,"danang");

        List<HocSinh> lishHocSinh = new ArrayList<>();
        lishHocSinh.add(hocSinh1);
        lishHocSinh.add(hocSinh2);
        lishHocSinh.add(hocSinh3);
        lishHocSinh.add(hocSinh4);
        lishHocSinh.add(hocSinh5);
        Collections.sort(lishHocSinh);
        for(HocSinh i : lishHocSinh){
            System.out.println(i.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lishHocSinh,ageComparator);
        System.out.println("So sanh theo tuoi");
        for(HocSinh i : lishHocSinh){
            System.out.println(i.toString());
        }
    }
}
