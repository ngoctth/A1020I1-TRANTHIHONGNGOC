package _11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_li_queue;

public class NhanVien {
    String name;
    String gender;
    String dayOfBird;

    public NhanVien(String name, String sex, String dayOfBird) {
        this.name = name;
        this.gender = sex;
        this.dayOfBird = dayOfBird;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", sex='" + gender + '\'' +
                ", dayOfBird='" + dayOfBird + '\'' +
                '}';
    }
}

