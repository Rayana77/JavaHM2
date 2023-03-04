package homework2;

import java.util.Scanner;

public class Task3 {

    public static void main (String[] args){

        System.out.println(("Введите температуру первой колбы"));
        Scanner scanner  = new Scanner(System.in);
        double temperature1 = scanner.nextInt();
        System.out.println(("Введите температуру второй колбы"));
        Scanner scanner1 = new Scanner(System.in);
        double temperature2 = scanner1.nextInt();

        boolean isWork = temperature1 > 100 && temperature2 < 100;

        System.out.println(isWork);


    }
}
