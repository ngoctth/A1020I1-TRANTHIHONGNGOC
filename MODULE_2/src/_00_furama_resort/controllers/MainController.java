package _00_furama_resort.controllers;

import _00_furama_resort.manager.ServiceManager;
import sun.applet.Main;

import java.util.Scanner;

public class MainController {
        ServiceManager serviceManager = new ServiceManager();
        public void displayMainMenu(Scanner input) {
            System.out.print(
                    "1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n"+"Please choose: " );
            int choose;
            choose = input.nextInt();
            switch (choose) {
                case 1: addNewServices(input);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.print("Please choose the service of menu");
                    displayMainMenu(input);
            }
        }


        public void addNewServices(Scanner input){
            System.out.println(
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n"+ " Choose service you want: ");
            int choice;
            choice = input.nextInt();
            switch (choice) {
                case 1: serviceManager.addNewVilla();
                    break;
                case 2: serviceManager.addNewHouse();
                    break;
                case 3: serviceManager.addNewRoom();
                    break;
                case 4: displayMainMenu(input);
                    break;
                case 5:
                    System.out.println("Goodbye and see you soon");
                    break;
                default:
                    System.out.print("Please choose the service of menu");
                    displayMainMenu(input);
            }
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MainController mainController = new MainController();
        mainController.displayMainMenu(input);
    }
    }


