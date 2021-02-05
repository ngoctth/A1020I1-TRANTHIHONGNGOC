package _00_furama_resort.models;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public static void main(String[] args) {

    Villa villa = new Villa("012","villa",40.5,300,2,"date",
            "normal","massage",30,3);
    House house = new House("03","House",30,206.5,3,"date",
            "normal","play golf",1);
    Room room = new Room("6","Room",50,120,3,
            "date","massage");
        System.out.println(villa.showInfor());
        System.out.println(house.showInfor());
        System.out.println(room.showInfor());



    }
}
