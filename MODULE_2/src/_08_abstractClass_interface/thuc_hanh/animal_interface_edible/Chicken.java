package _08_abstractClass_interface.thuc_hanh.animal_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: chip chip chip";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
