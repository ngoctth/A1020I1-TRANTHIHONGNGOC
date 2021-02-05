package _00_furama_resort.models;

public class House extends Services {
    private String tyOfRoom;
    private String otherConvenient;
    private int numberOfFloors;

    public House() {
    }

    public House(String id, String nameServices, double useArea, double rentFee, int numberOfCustomer,
                 String typeForRent, String tyOfRoom, String otherConvenient, int numberOfFloors) {
        super(id, nameServices, useArea, rentFee, numberOfCustomer, typeForRent);
        this.tyOfRoom = tyOfRoom;
        this.otherConvenient = otherConvenient;
        this.numberOfFloors = numberOfFloors;
    }

    public String getTyOfRoom() {
        return tyOfRoom;
    }

    public void setTyOfRoom(String tyOfRoom) {
        this.tyOfRoom = tyOfRoom;
    }

    public String getOtherConvenient() {
        return otherConvenient;
    }

    public void setOtherConvenient(String otherConvenient) {
        this.otherConvenient = otherConvenient;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfor() {
        return super.toString() + " House{" +
                "tyOfRoom='" + tyOfRoom + '\'' +
                ", otherConvenient='" + otherConvenient + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
