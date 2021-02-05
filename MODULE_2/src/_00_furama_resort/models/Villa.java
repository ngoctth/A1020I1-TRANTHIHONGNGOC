package _00_furama_resort.models;

public class Villa extends Services {
    private String tyOfRoom;
    private String otherConvenient;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String nameServices, double useArea, double rentFee,
                 int numberOfCustomer, String typeForRent, String tyOfRoom,
                 String otherConvenient, double poolArea, int numberOfFloors) {
        super(id, nameServices, useArea, rentFee, numberOfCustomer, typeForRent);
        this.tyOfRoom = tyOfRoom;
        this.otherConvenient = otherConvenient;
        this.poolArea = poolArea;
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfor() {
        return super.toString()+ " Villa{" +
                "tyOfRoom='" + tyOfRoom + '\'' +
                ", otherConvenient='" + otherConvenient + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
