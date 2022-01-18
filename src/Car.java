import java.util.Random;

public class Car {

    private static String []color = {"красный", "зелёный", "черныйй", "белый", "жёлтый"};
    private static String []model = {"Honda Accord", "Mazda RX8", "Nisan Skyline", "Toyota MarkII", "BMW M3"};
    private static int [] speed = {243, 200, 250, 230, 250};
    private String colorCar;
    private String modelCar;
    private int speedCar;

    public Car() {
        int i;
        Random nomberCar = new Random();
        i = nomberCar.nextInt(5);
        this.colorCar = color[i];
        this.modelCar = model[i];
        this.speedCar = speed[i];
    }

    public static void sorting(Car []player) {
        Car max = new Car();
        for (int i = 0; i < player.length - 1; i++) {
            for (int j = i +1; j < player.length; j++) {
                if (player[i].speedCar < player[j].speedCar) {
                    max = player[i];
                    player[i] = player[j];
                    player[j] = max;
                }
            }
        }
        for (int i = 0; i < player.length; i++) {
            System.out.println((i +1) + " " + player[i].modelCar + " " + player[i].speedCar + "км/ч " + player[i].colorCar);
        }
    }
}
