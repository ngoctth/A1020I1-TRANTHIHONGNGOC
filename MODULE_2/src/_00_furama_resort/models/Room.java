package _00_furama_resort.models;

public class Room extends Services{
    private String freeServices;

    public Room() {
    }

    public Room(String id, String nameServices, double useArea, double rentFee, int numberOfCustomer,
                String typeForRent, String freeServices) {
        super(id, nameServices, useArea, rentFee, numberOfCustomer, typeForRent);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String showInfor() {
        return super.toString() + " Room{" +
                "freeServices='" + freeServices + '\'' +
                '}' ;
    }
}
