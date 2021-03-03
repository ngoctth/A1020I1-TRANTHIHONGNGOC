package _12_java_collection_framework.thuc_hanh.luu_dah_sach_theo_do_tuoi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Nam",19);
        treeMap.put("Nu",20);
        treeMap.put("Lan",21);
        System.out.println("Tree Map : "+"\n"+ treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Nam",19);
        linkedHashMap.put("Nu",20);
        linkedHashMap.put("Lan",21);
        System.out.println("Linked Hash Map : "+"\n"+ linkedHashMap);

        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Nam",19);
        hashMap.put("Nu",20);
        hashMap.put("Lan",21);
        System.out.println("Hash Map : "+"\n"+ hashMap);

    }
}
