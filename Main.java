import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static public Scanner sc = new Scanner(System.in);
    static public Print print = new Print();
    static final List<String> berthName = new ArrayList<>();
    static final List<Vehicle> berthList = new ArrayList<>();

    public static void main(String[] args) {

        berthName.add("A");
        berthName.add("B");
        berthName.add("C");
        berthName.add("D");
        berthName.add("E");

        for (int i = 0; i < 5; i++) {
            berthList.add(null);
        }


        while (true) {


            print.printMainMenu();

            print.askUserForInput();
            int userInput = sc.nextInt();

            if (userInput == 1) {    // 1. See parked trucks
                {
                    for (int i = 0; i < 5; i++) {
                        if (berthList.get(i) != null) {
                            System.out.println("Berth " + berthName.get(i));
                            System.out.println(berthList.get(i));
                        }
                    }
                }
            } else if (userInput == 2) {   // 2. Register a new truck

                {
                    Vehicle vehicle = new Vehicle();
                    int truckSymbol;

                    while (true) {

                        print.printTypeOfTruck();
                        truckSymbol = sc.nextInt();
                        {
                            break;
                        }
                    }
                        print.printWeight();
                        int weight = sc.nextInt();
                        int berthIndex = -1;


                        if (truckSymbol == 1) {
                            vehicle = new Van(weight);
                            if (vehicle.getTruckType() == 1) {
                                if (berthList.get(0) == null) {
                                    berthIndex = 0;
                                } else if (berthList.get(1) == null) {
                                    berthIndex = 1;
                                } else {
                                    print.printNoBerths();
                                }
                            }
                        } else if (truckSymbol == 2) {
                            vehicle = new SmallTruck(weight);
                            if (vehicle.getTruckType() == 2) {
                                if (berthList.get(2) == null) {
                                    berthIndex = 2;
                                } else if (berthList.get(3) == null) {
                                    berthIndex = 3;
                                } else if (vehicle.getWeight() < 5000 && berthList.get(0) == null) {
                                    berthIndex = 0;
                                } else {
                                    print.printNoBerths();
                                }
                            }
                        } else if (truckSymbol == 3) {
                            vehicle = new HeavyTruck(weight);
                            if (vehicle.getTruckType() == 3) {
                                if (berthList.get(4) == null) {
                                    berthIndex = 4;
                                } else if (vehicle.getWeight() < 9000 && berthList.get(3) == null) {
                                    berthIndex = 3;
                                } else {
                                    print.printNoBerths();
                                }
                            }
                        }
                        if (berthIndex == -1) {
                            print.printWeAreFull();
                        } else {
                            System.out.println("Truck registered at berth " + berthName.get(berthIndex));
                            berthList.set(berthIndex, vehicle);
                        }
                    }
                } else if (userInput == 3) {     // 3. Quit
                    print.printShuttingDown();
                    System.exit(0);
                }
            }
        }
    }
