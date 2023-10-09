package fuelinjection;

import fuelinjection.car.Car;

import java.util.ArrayList;
import java.util.List;


public class RentCompany {
    private final List<Car> cars = new ArrayList<>();
    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.toString());
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
