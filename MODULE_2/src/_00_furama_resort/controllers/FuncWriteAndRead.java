package _00_furama_resort.controllers;

import _00_furama_resort.models.House;
import _00_furama_resort.models.Room;
import _00_furama_resort.models.Villa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FuncWriteAndRead {
    public static void writeVilla(Villa villa) {
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\_00_furama_resort\\data\\villa.csv",true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(villa.getId()+","+villa.getNameServices()+","+villa.getUseArea()+","+villa.getRentFee()
                    +","+villa.getNumberOfCustomer()+","+villa.getTypeForRent()+","+villa.getTyOfRoom()
                    +","+villa.getOtherConvenient()+","+villa.getNumberOfFloors()+","+villa.getPoolArea());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    public static void writeHouse(House house) {
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\_00_furama_resort\\data\\house.csv",true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(house.getId()+","+house.getNameServices()+","+house.getUseArea()+","+house.getRentFee()
                    +","+house.getNumberOfCustomer()+","+house.getTypeForRent()+","+house.getTyOfRoom()
                    +","+house.getOtherConvenient()+","+house.getNumberOfFloors());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    public static void writeRoom(Room room) {
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\_00_furama_resort\\data\\room.csv",true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(room.getId()+","+room.getNameServices()+","+room.getUseArea()+","+room.getRentFee()
                    +","+room.getNumberOfCustomer()+","+room.getTypeForRent()+","+room.getFreeServices());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
