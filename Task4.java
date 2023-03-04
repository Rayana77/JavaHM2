package homework2;

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        Random random = new Random();
        int seconds = random.nextInt(28801);
        int hours = seconds / 3600;
        System.out.println("Осталось " + seconds + "секунд");

        if (hours  == 0) {
            System.out.println("Осталось менее часа");
        }else {
            System.out.println("Осталось " + hours + "часов");

        }
    }
}


