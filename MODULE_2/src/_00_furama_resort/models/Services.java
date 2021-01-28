package _00_furama_resort.models;

public abstract class Services {
    private String id;
    private String nameServices;
    private double useArea;
    private double rentFee;
    private int numberOfCustomer;
    private String typeForRent;

    public Services() {
    }

    public Services(String id, String nameServices, double useArea, double rentFee, int numberOfCustomer, String typeForRent) {
        this.id = id;
        this.nameServices = nameServices;
        this.useArea = useArea;
        this.rentFee = rentFee;
        this.numberOfCustomer = numberOfCustomer;
        this.typeForRent = typeForRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getRentFee() {
        return rentFee;
    }

    public void setRentFee(double rentFee) {
        this.rentFee = rentFee;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public void setNumberOfCustomer(int numberOfCustomer) {
        this.numberOfCustomer = numberOfCustomer;
    }

    public String getTypeForRent() {
        return typeForRent;
    }

    public void setTypeForRent(String typeForRent) {
        this.typeForRent = typeForRent;
    }

    abstract public String showInfor();

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", useArea=" + useArea +
                ", rentFee=" + rentFee +
                ", numberOfCustomer=" + numberOfCustomer +
                ", typeForRent='" + typeForRent + '\'' +
                '}';
    }
}


