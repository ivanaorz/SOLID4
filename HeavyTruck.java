public class HeavyTruck extends Vehicle {

    public HeavyTruck(int weight) {
        this.truckType = 3;
        this.weight = weight;
    }

    public String toString() {
        return "Heavy truck, weight: " + weight + "kg";
    }

}
