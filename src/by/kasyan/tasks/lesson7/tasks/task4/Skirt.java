package by.kasyan.tasks.lesson7.tasks.task4;

public class Skirt extends Clothes implements WomenClothing {

    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Put on a skirt");
    }
}
