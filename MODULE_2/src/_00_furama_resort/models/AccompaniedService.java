package _00_furama_resort.models;

public class AccompaniedService {
    private String nameAccompaniedService;
    private int unit;
    private double price;

    public AccompaniedService() {
    }

    public AccompaniedService(String nameAccompaniedService, int unit, double price) {
        this.nameAccompaniedService = nameAccompaniedService;
        this.unit = unit;
        this.price = price;
    }

    public String getNameAccompaniedService() {
        return nameAccompaniedService;
    }

    public void setNameAccompaniedService(String nameAccompaniedService) {
        this.nameAccompaniedService = nameAccompaniedService;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
