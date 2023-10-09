package fuelinjection.car;

import fuelinjection.car.Car;

public class Sonata extends Car {
    private final String name;
    private final int distancePerLiter;
    private final int tripDistance;


    public Sonata(int tripDistance) {
        this.name = "Sonata";
        this.distancePerLiter = 10;
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return this.distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return getName() + " : " + Math.round(getChargeQuantity()) +"리터";
    }
}
