public class Engine {
    int capacity;
    String fueltype;
    int power;

    public Engine(int capacity, String fueltype, int power) {
        this.capacity = capacity;
        this.fueltype = fueltype;
        this.power = power;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getFueltype() {
        return fueltype;
    }

    public int getPower() {
        return power;
    }
}
