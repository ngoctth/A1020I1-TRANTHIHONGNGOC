package _12_java_collection_framework.thuc_hanh.phanbiet_hashmap_hashset;

public class Student {
    private String name;
    private Integer old;
    private String add;

    public Student() {
    }

    public Student(String name, Integer old, String add) {
        this.name = name;
        this.old = old;
        this.add = add;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", add='" + add + '\'' +
                '}';
    }
}
