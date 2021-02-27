package _00_furama_resort.manager;

import _00_furama_resort.controllers.FuncWriteAndRead;
import _00_furama_resort.controllers.MainController;
import _00_furama_resort.models.House;
import _00_furama_resort.models.Room;
import _00_furama_resort.models.Villa;

import java.util.Scanner;

public class ServiceManager {

    Scanner input = new Scanner(System.in);
    public void addNewVilla(){
        System.out.print("Enter your ID: ");
        String id = input.nextLine();
        System.out.print("Enter name service: ");
        String nameServices = input.nextLine();
        System.out.print("Enter room of area: ");
        double useArea = input.nextDouble();
        System.out.print("Enter rent fee: ");
        double rentFee = input.nextDouble();
        System.out.print("Enter number of customer: ");
        int numberOfCustomer = input.nextInt();
        System.out.print("Enter type for rent (Year/ Month/ Day): ");
        String typeForRent = input.nextLine();
        input.nextLine();
        System.out.print("Enter type of villa: ");
        String tyOfRoom = input.nextLine();
        System.out.print("Do you want to use other convenient ( massage, karaoke, food, drink, " +
                "rent car/bicycle/motorbike.)?: ");
        String otherConvenient = input.nextLine();
        System.out.print("Enter number of floors: ");
        int numberOfFloors = input.nextInt();
        System.out.print("Enter pool of area: ");
        double poolArea = input.nextDouble();
        Villa  villa = new Villa();
        villa.setId(id);
        villa.setNameServices(nameServices);
        villa.setUseArea(useArea);
        villa.setRentFee(rentFee);
        villa.setNumberOfCustomer(numberOfCustomer);
        villa.setTypeForRent(typeForRent);
        villa.setTyOfRoom(tyOfRoom);
        villa.setOtherConvenient(otherConvenient);
        villa.setNumberOfFloors(numberOfFloors);
        villa.setPoolArea(poolArea);
        FuncWriteAndRead.writeVilla(villa);

        }

    public void addNewHouse(){
        System.out.print("Enter your ID: ");
        String id = input.nextLine();
        System.out.print("Enter name service: ");
        String nameServices = input.nextLine();
        System.out.print("Enter room of area: ");
        double useArea = input.nextDouble();
        System.out.print("Enter rent fee: ");
        double rentFee = input.nextDouble();
        System.out.print("Enter number of customer: ");
        int numberOfCustomer = input.nextInt();
        System.out.print("Enter type for rent (Year/ Month/ Day): ");
        String typeForRent = input.nextLine();
        input.nextLine();
        System.out.print("Enter type of house: ");
        String tyOfRoom = input.nextLine();
        System.out.print("Do you want to use other convenient ( massage, karaoke, food, drink, " +
                "rent car/bicycle/motorbike.)?: ");
        String otherConvenient = input.nextLine();
        System.out.print("Enter number of floors: ");
        int numberOfFloors = input.nextInt();
        House house = new House();
        house.setId(id);
        house.setNameServices(nameServices);
        house.setUseArea(useArea);
        house.setRentFee(rentFee);
        house.setNumberOfCustomer(numberOfCustomer);
        house.setTypeForRent(typeForRent);
        house.setTyOfRoom(tyOfRoom);
        house.setOtherConvenient(otherConvenient);
        house.setNumberOfFloors(numberOfFloors);
        FuncWriteAndRead.writeHouse(house);

    }
    public void addNewRoom(){
        System.out.print("Enter your ID: ");
        String id = input.nextLine();
        System.out.print("Enter name service: ");
        String nameServices = input.nextLine();
        System.out.print("Enter room of area: ");
        double useArea = input.nextDouble();
        System.out.print("Enter rent fee: ");
        double rentFee = input.nextDouble();
        System.out.print("Enter number of customer: ");
        int numberOfCustomer = input.nextInt();
        System.out.print("Enter type for rent (Year/ Month/ Day): ");
        String typeForRent = input.nextLine();
        input.nextLine();
        System.out.print("Do you want to use free service (drink/gym/rent bicycle)?");
        String freeServices = input.nextLine();
        Room room = new Room();
        room.setId(id);
        room.setNameServices(nameServices);
        room.setUseArea(useArea);
        room.setRentFee(rentFee);
        room.setNumberOfCustomer(numberOfCustomer);
        room.setTypeForRent(typeForRent);
        room.setFreeServices(freeServices);
        FuncWriteAndRead.writeRoom(room);

    }

}
