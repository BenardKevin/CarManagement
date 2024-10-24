public class Car {
    protected String brand;
    protected String model;
    protected int year_of_creation;
    protected int speed;
    protected int max_speed = 400;

    public Car(String brand, String model, int year_of_creation, int speed, int max_speed) {
        this.brand = brand;
        this.model = model;
        this.year_of_creation = year_of_creation;
        this.speed = speed;
        this.max_speed = max_speed;
    }

    public Car(String brand, String model, int year_of_creation, int speed) {
        this.brand = brand;
        this.model = model;
        this.year_of_creation = year_of_creation;
        this.speed = speed;
    }

    protected void start() {
        if (this.speed == 0) this.speed = 1;
    }
    protected void accelerate() {
        if (this.speed != 0) this.speed++;
    }
    protected void brake() {
        if (this.speed > 0) this.speed--;
    }
    protected void displayStatus() {
        System.out.printf("%s %s: made in %2d, actual speed %2d.%n", this.brand, this.model, this.year_of_creation, this.speed);
    }
}
