package _11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_map;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.util.TreeMap;

public class SoLanXuatHien {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap cau: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        int value = 0;
        for(int i =0; i<input.length();i++){
            if(!map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), 1);
            }else {
                value = map.get(input.charAt(i));
                value++;
                map.put(input.charAt(i), value);
            }
        }
        System.out.println(map);
    }
}
