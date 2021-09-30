package by.kasyan.tasks.lesson6.task5;

public class Drum implements Instrument {

    private final String size;

    public Drum(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Игарет барабан следующего размера: " + size + ".");
    }
}

