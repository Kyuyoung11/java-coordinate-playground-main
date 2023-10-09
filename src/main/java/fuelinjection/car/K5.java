package fuelinjection.car;

public class K5 extends Car {

    private final String name;
    private final int distancePerLiter;
    private final int tripDistance;

    public K5(int tripDistance) {
        this.name = "K5";
        this.distancePerLiter = 13;
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
