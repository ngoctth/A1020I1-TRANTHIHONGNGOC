package _12_java_collection_framework.thuc_hanh.comparable_comparator;

public class HocSinh implements Comparable<HocSinh>  {
    private String name;
    private Integer old;
    private String add;

    public HocSinh() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public HocSinh(String name, Integer old, String add) {
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

    @Override
    public int compareTo(HocSinh hocSinh) {
        return this.name.compareTo(hocSinh.getName());
    }
}


