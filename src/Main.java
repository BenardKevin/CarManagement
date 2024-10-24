import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car v1 = new Car("Renault", "Twingo", 2017, 0, 160);
        Car v2 = new Car("Tesla", "Model Y", 2024, 0);

        v1.start();
        while (v1.speed != v1.max_speed) v1.accelerate();
        v1.brake();

        v2.start();
        while (v2.speed != v2.max_speed) v2.accelerate();

        v1.displayStatus();
        v2.displayStatus();
    }
}