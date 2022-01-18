import java.util.Scanner;

public class Rase {

    public static void main(String[] args) {
        int countCar;
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите количество участников");
        countCar = vvod.nextInt();
        startRase(countCar);
        startRase(countCar);
        startRase(countCar);

    }

    public static void startRase(int count) {
        Car []playerCar = new Car[count];
        for (int i = 0; i < count; i++) {
            playerCar[i] = new Car();
        }
        Car.sorting(playerCar);
    }
}
