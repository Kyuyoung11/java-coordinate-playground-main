package fuelinjection.car;

public class Avante extends Car {
    private final String name;
    private final int distancePerLiter;
    private final int tripDistance;

    public Avante(int tripDistance) {
        this.name = "Avante";
        this.distancePerLiter = 15;
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
    double getChargeQuantity() {
        return super.getChargeQuantity();
    }

    @Override
    public String toString() {
        return getName() + " : " + Math.round(getChargeQuantity()) +"리터";
    }
}
