package _12_java_collection_framework.thuc_hanh.phanbiet_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Ngoc",20,"DN");
        Student student2 = new Student("Nga",12,"HCM");
        Student student3 = new Student("Nguy",23," HN");

        HashMap<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        System.out.println(studentMap);

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student1);

        System.out.println(hashSet);
    }



}
