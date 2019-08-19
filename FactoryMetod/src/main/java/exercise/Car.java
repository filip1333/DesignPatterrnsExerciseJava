package exercise;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Car {

    private String color;
    private double weight;
    private String carClass;
    private String carBrand;
    private int bodyStyle;
    private boolean isPassengerCar;

    public void setIsPassengerCar(boolean isPassengerCar) {
        this.isPassengerCar = isPassengerCar;
    }
}
