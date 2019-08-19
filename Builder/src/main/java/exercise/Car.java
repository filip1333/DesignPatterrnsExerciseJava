package exercise;

public class Car {

    private String wheels;
    private String engine;
    private String body;
    private boolean lights;
    private String interior;
    private boolean fuelTank;
    private boolean isPremiumVersion;

    public Car(String wheels, String engine, String body, boolean lights, String interior, boolean fuelTank, boolean isPremiumVersion) {
        this.wheels = wheels;
        this.engine = engine;
        this.body = body;
        this.lights = lights;
        this.interior = interior;
        this.fuelTank = fuelTank;
        this.isPremiumVersion = isPremiumVersion;
    }

    public String toString() {
        return "Car has: " + wheels + ", engine: " + engine + ", his body has " + body + ", lights " + lights + ", in interior: " + interior + ", fuel tank " + fuelTank + " and is premium version: " + isPremiumVersion;
    }
}