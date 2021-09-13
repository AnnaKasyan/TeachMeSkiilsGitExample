package by.kasyan.tasks.lesson3.additionalTasks.task5;

import java.util.Random;
import java.util.Scanner;

public class Task {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size;
        size = in.nextInt();
        in.close();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(1000);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
