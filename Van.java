public class Van extends Vehicle {


    public Van(int weight) {
        this.truckType = 1;
        this.weight = weight;
    }

    public String toString() {
        return "Van, weight: " + weight + "kg";
    }
}
