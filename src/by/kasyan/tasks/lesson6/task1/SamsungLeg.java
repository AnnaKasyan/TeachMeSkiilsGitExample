package by.kasyan.tasks.lesson6.task1;

public class SamsungLeg implements ILeg {

    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
