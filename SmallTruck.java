public class SmallTruck extends Vehicle {

    public SmallTruck (int weight) {
        this.truckType = 2;
        this.weight = weight;
    }

    public String toString() {
        return "Small truck, weight: " + weight + "kg";
    }
}

